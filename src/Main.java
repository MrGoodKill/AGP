import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("FICHIER DE BASE :\n\n");

        String content = new Scanner(new File("grammar/test.txt")).useDelimiter("\\Z").next();

        System.out.println(content+"\n\n");
        System.out.println("TRADUCTION :\n\n");

        HelloLexer lexer = new HelloLexer( new ANTLRFileStream("grammar/test.txt"));
        CommonTokenStream tokens = new CommonTokenStream( lexer );
        HelloParser parser = new HelloParser( tokens );
        ParseTree tree = parser.r();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk( new HelloBaseListener(), tree );
    }
}
