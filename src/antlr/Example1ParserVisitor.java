// Generated from java-escape by ANTLR 4.11.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Example1Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Example1ParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Example1Parser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(Example1Parser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link Example1Parser#arrayDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDef(Example1Parser.ArrayDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayINT}
	 * labeled alternative in {@link Example1Parser#arraybody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayINT(Example1Parser.ArrayINTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayString}
	 * labeled alternative in {@link Example1Parser#arraybody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayString(Example1Parser.ArrayStringContext ctx);
}