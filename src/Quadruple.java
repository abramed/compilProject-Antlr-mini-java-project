import java.util.ArrayList;
import java.util.LinkedList;

public class Quadruple extends GramaireBaseListener  {
    ArrayList<Quad> quads =new ArrayList<Quad>();
    int cmp=0;
    ArrayList<String> listtmp = new ArrayList<>();
    LinkedList<Integer> savestat= new LinkedList<>();
    ArrayList<String> objetC=new ArrayList<>();
    LinkedList<Integer> indic = new LinkedList<>();
    LinkedList<String> Etique = new LinkedList<>();
    int cid=0;

    @Override
    public void exitCalcul(GramaireParser.CalculContext ctx) {
        String tmp = listtmp.get(listtmp.size()-1);
        listtmp.remove(listtmp.size()-1);
        Quad q = new Quad("=",ctx.IDF().getText(),"",tmp);
        quads.add(q);
        super.exitCalcul(ctx);
    }

    @Override
    public void exitVal(GramaireParser.ValContext ctx) {
        if(ctx.ENTIER()!=null)
        {
            listtmp.add(ctx.ENTIER().getText());
        }
        if (ctx.IDF()!=null)
        {
            listtmp.add(ctx.IDF().getText());
        }
        super.exitVal(ctx);
    }

    @Override
    public void exitExpression(GramaireParser.ExpressionContext ctx) {

        if (ctx.expression()!=null)
        {
            if (ctx.op1()!=null)
            {
                String tmp = "t"+(cmp++);
                String t1=listtmp.get(listtmp.size()-1);
                listtmp.remove(listtmp.size()-1);

                String t2=listtmp.get(listtmp.size()-1);
                listtmp.remove(listtmp.size()-1);
                listtmp.add(tmp);
                Quad q = new Quad(ctx.op1().getText(),t2,t1,tmp);
                quads.add(q);



            }


        }
        super.exitExpression(ctx);
    }

    @Override
    public void exitExpression2(GramaireParser.Expression2Context ctx) {
        if (ctx.op2()!=null)
        {
            String tmp = "t"+(cmp++);
            String t1=listtmp.get(listtmp.size()-1);
            listtmp.remove(listtmp.size()-1);

            String t2=listtmp.get(listtmp.size()-1);
            listtmp.remove(listtmp.size()-1);
            listtmp.add(tmp);
            Quad q = new Quad(ctx.op2().getText(),t2,t1,tmp);
            quads.add(q);
        }
        super.exitExpression2(ctx);
    }

    @Override
    public void exitSi(GramaireParser.SiContext ctx) {
        int save=savestat.removeLast();
       Quad q= quads.get(save-1);
        q.set(1,""+(quads.size()));
        super.exitSi(ctx);
    }

    @Override
    public void exitEnd(GramaireParser.EndContext ctx) {
        Quad q = new Quad("END","","","");
        quads.add(q);
        super.exitEnd(ctx);
    }

    @Override
    public void exitCondition(GramaireParser.ConditionContext ctx) {
        Quad q;
        String t1=listtmp.get(listtmp.size()-1);
        listtmp.remove(listtmp.size()-1);

        String t2=listtmp.get(listtmp.size()-1);
        listtmp.remove(listtmp.size()-1);
        switch (ctx.LOGIQUE().getText())
        {
            case "=":
                q = new Quad("BNE","",t2,t1);
                quads.add(q);
                savestat.add(quads.size()-1);
                break;
            case "!=":
                q = new Quad("BE","",t2,t1);
                quads.add(q);
                savestat.add(quads.size()-1);
                break;
            case ">":
                q = new Quad("BLE","",t2,t1);
                quads.add(q);
                savestat.add(quads.size()-1);
                break;
            case "<":
                q = new Quad("BGE","",t2,t1);
                quads.add(q);
                savestat.add(quads.size()-1);
                break;
            case ">=":
                q = new Quad("BL","",t2,t1);
                quads.add(q);
                savestat.add(quads.size()-1);
                break;
            case "<=":
                q = new Quad("BG","",t2,t1);
                quads.add(q);
                savestat.add(quads.size()-1);
                break;
        }
        super.exitCondition(ctx);
    }

    @Override
    public void enterSinon(GramaireParser.SinonContext ctx) {
        System.out.println(savestat);
        System.out.println(quads);


        int save=savestat.removeLast();
        quads.get(save).set(1,""+(quads.size()+1));
        Quad q = new Quad("BR","","","");
        quads.add(q);
        savestat.add(quads.size());
        super.enterSinon(ctx);
    }

    void afficher()
    {   int i=0;
        for( Quad q: quads) {
            System.out.println(""+(i++)+q);

        }
        System.out.println("**************************************************************************");
        for(String s :objetC)
        {
            System.out.println("\t"+s);
        }
    }

    public void Code_Objet()
    {   Quad q;
        for(int i=0 ;i<=quads.size()-1;i++)
        {   q=quads.get(i);
            if (!indic.isEmpty()){
                if (indic.getFirst()==i)
                {
                        indic.removeFirst();
                        String etiq1 =Etique.removeFirst();
                         objetC.add(etiq1);
                }
            }
            if (q.get(0).equals("="))
            {
                objetC.add(" MOV AX,"+q.get(3));
                objetC.add("MOV "+q.get(1)+", AX");
            }
            if (q.get(0).equals("+"))
            {
                objetC.add(" MOV AX,"+q.get(1));
                objetC.add("ADD "+"AX, "+q.get(2));
                objetC.add("MOV "+q.get(3)+", AX");
            }
            if(q.get(0).equals("-"))
            {
                objetC.add(" MOV AX,"+q.get(1));
                objetC.add("SUB "+"AX, "+q.get(2));
                objetC.add("MOV "+q.get(3)+", AX");
            }
            if(q.get(0).equals("*"))
            {
                objetC.add("MOV AX,"+q.get(1));
                objetC.add("MULT "+"AX, "+q.get(2));
                objetC.add("MOV "+q.get(3)+", AX");
            }

            if(q.get(0).equals("/"))
            {
                objetC.add(" MOV AX,"+q.get(1));
                objetC.add("DIV "+"AX, "+q.get(2));
                objetC.add("MOV "+q.get(3)+", AX");
            }
            String etiq;
            switch (q.get(0))
            {
                case "BNE" :
                {
                    objetC.add("MOV AX,"+q.get(2));
                    objetC.add("CMP "+"AX, "+q.get(3));
                    etiq = "ETIQ"+(++cid);
                    objetC.add("JNE "+etiq);
                    Etique.add(etiq);
                    indic.add(Integer.valueOf(q.get(1)));
                    System.out.println(indic.getLast());
                    break;

                }
                case "BE" :
                {   objetC.add("MOV AX,"+q.get(2));
                    objetC.add("CMP "+"AX, "+q.get(3));
                    etiq = "ETIQ"+(++cid);
                    objetC.add("JE "+etiq);
                    indic.add(Integer.valueOf(q.get(1)));
                    Etique.add(etiq);
                    break;
                }
                case "BLE" :
                {
                    objetC.add("MOV AX,"+q.get(2));
                    objetC.add("CMP "+"AX, "+q.get(3));
                    etiq = "ETIQ"+(++cid);
                    objetC.add("JLE "+etiq);
                    indic.add(Integer.valueOf(q.get(1)));
                    Etique.add(etiq);
                    break;
                }
                case "BGE" :
                {
                    objetC.add("MOV AX,"+q.get(2));
                    objetC.add("CMP "+"AX, "+q.get(3));
                    etiq = "ETIQ"+(++cid);
                    objetC.add("JGE "+etiq);
                    indic.add(Integer.valueOf(q.get(1)));
                    Etique.add(etiq);

                    break;
                }
                case "BG" :
                {
                    objetC.add("MOV AX,"+q.get(2));
                    objetC.add("CMP "+"AX, "+q.get(3));
                    etiq = "ETIQ"+(++cid);
                    objetC.add("JG "+etiq);
                    indic.add(Integer.valueOf(q.get(1)));
                    Etique.add(etiq);
                    break;
                }
                case "BL" :
                {
                    objetC.add("MOV AX,"+q.get(2));
                    objetC.add("CMP "+"AX, "+q.get(3));
                    etiq = "ETIQ"+(++cid);
                    objetC.add("JL "+etiq);
                    indic.add(Integer.valueOf(q.get(1)));
                    Etique.add(etiq);
                    break;
                }
                case "BR":
                {
                    etiq = "ETIQ"+(++cid);
                    objetC.add("JMP "+etiq);
                    indic.add(Integer.valueOf(q.get(1)));
                    Etique.add(etiq);
                    break;
                }
            }
        }
        while (!indic.isEmpty())
        {
            indic.removeFirst();
            String etiq1 =Etique.removeFirst();
            objetC.add(etiq1);
        }

    }
}
