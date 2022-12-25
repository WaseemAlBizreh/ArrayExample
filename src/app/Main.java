package app;

import AST.Program;
import Visitor.Example1Visitor;
import antlr.Example1Lexer;
import antlr.Example1Parser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {
    public static void main(String []args) throws IOException {
        String source = "Files/test2.txt";
        CharStream charStream = fromFileName(source);
        Example1Lexer lexer = new Example1Lexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Example1Parser parser = new Example1Parser(tokens);
        ParseTree ast = parser.array();
        Example1Visitor example1Visitor = new Example1Visitor();
        Program program = (Program) example1Visitor.visit(ast);
        System.out.println(program);
    }
}
