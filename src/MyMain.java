

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;

public class MyMain {
    public static void main(String[] args) throws IOException {
        GramaireLexer lexer = new GramaireLexer(CharStreams.fromFileName("src/input.txt"));

        CommonTokenStream tokenStream = new CommonTokenStream( lexer);
        GramaireParser parser = new GramaireParser( tokenStream);

        GramaireParser.Start_rulesContext tree = parser.start_rules();
        ParseTreeWalker walker = new ParseTreeWalker();
        Routine r=new Routine();
        walker.walk(r,tree);
        Quadruple q =new Quadruple();
       if(!r.error){
        walker.walk(q,tree);


        r.ts.afficherTs();

        q.Code_Objet();
        q.afficher();
        }
    }
}
