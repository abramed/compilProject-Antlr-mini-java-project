import java.util.LinkedList;

public class Routine extends GramaireBaseListener {
    TableSymbol ts= new TableSymbol();
    String typeCourant;
    Object valcourant;
    boolean error=false;
    boolean inout =false,lang=false;
    boolean div=false;
    float some=0;
    LinkedList<Float> ls =new LinkedList<Float>();

    int flag =0;
    @Override
    public void exitDeclaration(GramaireParser.DeclarationContext ctx) {
        boolean declare =true;
        String type = ctx.TYPE().getText();
        String name = ctx.declaration1().IDF().getText();

        if(!ts.getTs().containsKey(name))
        {
            ts.addElement(name,declare,type,0);}
        else{
            System.out.println("double declaration de "+name);
            error=true;
        }
        if(ctx.declaration1().VR()!=null)
        {
            name=ctx.declaration1().declaration1().IDF().getText();
            if(!ts.getTs().containsKey(name))
            {
                ts.addElement(name,declare,type,0);}
            else{
                System.out.println("double declaration de "+name);
                error=true;
            }
        }

        super.exitDeclaration(ctx);

    }

    @Override
    public void exitCalcul(GramaireParser.CalculContext ctx) {
        String name =ctx.IDF().getText();
        String type;
        if(!ts.getTs().containsKey(name))
        {
            System.out.println("la variable "+name+" n'est pas declarer .");
            error=true;
        }
        else
        {
           type=ts.get_Element(name).getType();
           if(typeCourant.equals("string_SJ") &&!type.equals("string_SJ"))
           {
               System.out.println("erreur de type"); error=true;
           }
            if(!typeCourant.equals("string_SJ") &&type.equals("string_SJ"))
            {
                System.out.println("erreur de type"); error= true;
            }
            if(!ls.isEmpty()){
            float val = ls.removeLast();

            ts.getTs().get(name).setValeur(val);}



        }


        super.exitCalcul(ctx);
    }


    @Override
    public void exitVal(GramaireParser.ValContext ctx) {
        if(ctx.IDF()!=null)
        {
            if(!ts.getTs().containsKey(ctx.IDF().getText()))
            {
                System.out.println("la variable "+ctx.IDF().getText()+" n'est pas declarer .");
                error=true;
            }
            else
            {
                ls.add(ts.getTs().get(ctx.IDF().getText()).getValeur());
            }
        }
        if (ctx.ENTIER()!=null)
        {   float val=Float.valueOf(ctx.ENTIER().getText());
            ls.add(val);
        }
        super.exitVal(ctx);
    }

    @Override
    public void exitExpression(GramaireParser.ExpressionContext ctx) {
        if(ctx.op1()!=null)
        {   float t1= ls.removeLast();
            float t2=ls.removeLast();
            if (ctx.op1().getText().equals("+"))
            {

                float res=t1+t2;
                ls.add(res);
            }
            if (ctx.op1().getText().equals("-"))
            {
                float res=t2-t1;
                ls.add(res);
            }

        }

        if(ctx.string()!=null) {
            typeCourant="string_SJ";
        }
        else {
            typeCourant = "float_SJ";
        }
        super.exitExpression(ctx);
         }

    @Override
    public void exitExpression2(GramaireParser.Expression2Context ctx) {
        if(ctx.op2()!=null)
        {   float t1= ls.removeLast();
            float t2=ls.removeLast();
            if (ctx.op2().getText().equals("/"))
            {
                if(t1==0)
                {
                    System.out.println("division par zero ");error=true;
                }
                else
                {
                    float res=t2/t1;
                    ls.add(res);
                }
            }
            if (ctx.op2().getText().equals("*"))
            {
                float res=t1*t2;
                ls.add(res);
            }
        }
        super.exitExpression2(ctx);
    }

    @Override
    public void exitBib(GramaireParser.BibContext ctx) {
        if(ctx.BIB()!=null)
        {
            if(ctx.BIB().getText().equals("Small_Java.lang"))
            {
                lang=true;
            }
            if (ctx.BIB().getText().equals("Small_Java.io"))
            {
                inout=true;
            }
        }
        super.exitBib(ctx);
    }

    @Override
    public void exitInstruction(GramaireParser.InstructionContext ctx) {
        if(ctx.calcul()!=null|| ctx.si()!=null)
        {
            if (!lang)
            {
                System.out.println("Vous devez appeler la bibliothéaue Small_java.lang");error=true;
            }
        }
        if(ctx.lecture()!=null ||ctx.ecriture()!=null)
        {
            if(!inout)
            {
                System.out.println("vous devez appelez la bibliothéque Small_Java.io");error=true;
            }
        }
        super.exitInstruction(ctx);
    }


}