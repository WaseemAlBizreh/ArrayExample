// Generated from java-escape by ANTLR 4.11.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Example1Parser}.
 */
public interface Example1ParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Example1Parser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(Example1Parser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(Example1Parser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link Example1Parser#arrayDef}.
	 * @param ctx the parse tree
	 */
	void enterArrayDef(Example1Parser.ArrayDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link Example1Parser#arrayDef}.
	 * @param ctx the parse tree
	 */
	void exitArrayDef(Example1Parser.ArrayDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayINT}
	 * labeled alternative in {@link Example1Parser#arraybody}.
	 * @param ctx the parse tree
	 */
	void enterArrayINT(Example1Parser.ArrayINTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayINT}
	 * labeled alternative in {@link Example1Parser#arraybody}.
	 * @param ctx the parse tree
	 */
	void exitArrayINT(Example1Parser.ArrayINTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayString}
	 * labeled alternative in {@link Example1Parser#arraybody}.
	 * @param ctx the parse tree
	 */
	void enterArrayString(Example1Parser.ArrayStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayString}
	 * labeled alternative in {@link Example1Parser#arraybody}.
	 * @param ctx the parse tree
	 */
	void exitArrayString(Example1Parser.ArrayStringContext ctx);
}