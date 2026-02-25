// Generated from Calculadora.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalculadoraParser}.
 */
public interface CalculadoraListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalculadoraParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(CalculadoraParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(CalculadoraParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link CalculadoraParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpr(CalculadoraParser.PrintExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link CalculadoraParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpr(CalculadoraParser.PrintExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blank}
	 * labeled alternative in {@link CalculadoraParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterBlank(CalculadoraParser.BlankContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blank}
	 * labeled alternative in {@link CalculadoraParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitBlank(CalculadoraParser.BlankContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculadoraParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(CalculadoraParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculadoraParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(CalculadoraParser.ExprContext ctx);
}