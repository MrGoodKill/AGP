import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static final boolean DEBUG = true;

    public static void main(String[] args) throws IOException {

        System.out.println("FICHIER DE BASE :\n\n");

        String content = new Scanner(new File("../grammar/test.txt")).useDelimiter("\\Z").next();

        System.out.println(content+"\n\n");
        System.out.println("TRADUCTION :\n");

        HelloLexer lexer = new HelloLexer( new ANTLRFileStream("../grammar/test.txt"));
        CommonTokenStream tokens = new CommonTokenStream( lexer );
        HelloParser parser = new HelloParser( tokens );
        Root tree = parser.r().root;
        
        System.out.println(tree.toASM());
        
        PrintWriter writer = new PrintWriter("../../Shared/hello.asm", "UTF-8");
        writer.println(tree.toASM());
        writer.close();
    }
}
