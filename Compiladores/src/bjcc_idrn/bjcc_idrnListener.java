// Generated from bjcc_idrn.g4 by ANTLR 4.4
package bjcc_idrn;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link bjcc_idrnParser}.
 */
public interface bjcc_idrnListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link bjcc_idrnParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(@NotNull bjcc_idrnParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link bjcc_idrnParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(@NotNull bjcc_idrnParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link bjcc_idrnParser#goal}.
	 * @param ctx the parse tree
	 */
	void enterGoal(@NotNull bjcc_idrnParser.GoalContext ctx);
	/**
	 * Exit a parse tree produced by {@link bjcc_idrnParser#goal}.
	 * @param ctx the parse tree
	 */
	void exitGoal(@NotNull bjcc_idrnParser.GoalContext ctx);
	/**
	 * Enter a parse tree produced by {@link bjcc_idrnParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(@NotNull bjcc_idrnParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link bjcc_idrnParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(@NotNull bjcc_idrnParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link bjcc_idrnParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull bjcc_idrnParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link bjcc_idrnParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull bjcc_idrnParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link bjcc_idrnParser#mainClass}.
	 * @param ctx the parse tree
	 */
	void enterMainClass(@NotNull bjcc_idrnParser.MainClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link bjcc_idrnParser#mainClass}.
	 * @param ctx the parse tree
	 */
	void exitMainClass(@NotNull bjcc_idrnParser.MainClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link bjcc_idrnParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(@NotNull bjcc_idrnParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link bjcc_idrnParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(@NotNull bjcc_idrnParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link bjcc_idrnParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull bjcc_idrnParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link bjcc_idrnParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull bjcc_idrnParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link bjcc_idrnParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(@NotNull bjcc_idrnParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link bjcc_idrnParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(@NotNull bjcc_idrnParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link bjcc_idrnParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull bjcc_idrnParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link bjcc_idrnParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull bjcc_idrnParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link bjcc_idrnParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(@NotNull bjcc_idrnParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link bjcc_idrnParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(@NotNull bjcc_idrnParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link bjcc_idrnParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(@NotNull bjcc_idrnParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link bjcc_idrnParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(@NotNull bjcc_idrnParser.ClassDeclarationContext ctx);
}