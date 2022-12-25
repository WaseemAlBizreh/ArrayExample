package Visitor;

import AST.Array;
import AST.IntArray;
import AST.Program;
import AST.StringArray;
import antlr.Example1Parser;
import antlr.Example1ParserBaseVisitor;

public class Example1Visitor extends Example1ParserBaseVisitor {
    @Override
    public Program visitArray(Example1Parser.ArrayContext ctx) {
        Program program = new Program();
        for (int i = 0; i < ctx.arrayDef().size(); i++) {
            program.addChild(visitArrayDef(ctx.arrayDef().get(i)));
        }
        return program;
    }

    @Override
    public Array visitArrayDef(Example1Parser.ArrayDefContext ctx) {
        return (Array) visit(ctx.arraybody());
    }

    @Override
    public Array visitArrayINT(Example1Parser.ArrayINTContext ctx) {
        IntArray arrayInt = new IntArray();
        for (int i = 0; i < ctx.ARRAY_INT().size(); i++) {
            arrayInt.addChild(Integer.parseInt(ctx.ARRAY_INT().get(i).getText()));
        }
        return arrayInt;
    }

    @Override
    public Array visitArrayString(Example1Parser.ArrayStringContext ctx) {
        StringArray stringArray = new StringArray();
        for (int i = 0; i < ctx.ARRAY_STRING().size(); i++) {
            stringArray.addChild(ctx.ARRAY_STRING().get(i).toString());
        }
        return stringArray;
    }
}
