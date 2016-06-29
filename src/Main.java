import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static final boolean DEBUG = true;

    public static void main(String[] args) throws IOException {

        System.out.println("FICHIER DE BASE :\n\n");

        String content = new Scanner(new FileInputStream("test.txt"), "UTF-8").useDelimiter("\\Z").next();

        System.out.println(content+"\n\n");
        System.out.println("TRADUCTION :\n");

        // On va chercher le fichier contenant notre code
        HelloLexer lexer = new HelloLexer( new ANTLRFileStream("test.txt", "UTF-8"));
        CommonTokenStream tokens = new CommonTokenStream( lexer );
        // On instancie le parser à partir du résultat donné par le lexer
        HelloParser parser = new HelloParser( tokens );
        // On instancie notre arbre grace au parser
        Root tree = parser.r().root;

        // On convertit cet arbre en du code assembleur
        String sortie = tree.toASM();
        System.out.println(sortie);
        
        // Et on écrit ce code dans un fichier
        PrintWriter writer = new PrintWriter("hello.asm", "UTF-8");
        writer.println(sortie);
        writer.close();
    }
}
