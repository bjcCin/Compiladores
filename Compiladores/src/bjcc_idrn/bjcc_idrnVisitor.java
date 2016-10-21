// Generated from bjcc_idrn.g4 by ANTLR 4.4
package bjcc_idrn;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link bjcc_idrnParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface bjcc_idrnVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link bjcc_idrnParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(@NotNull bjcc_idrnParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link bjcc_idrnParser#goal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoal(@NotNull bjcc_idrnParser.GoalContext ctx);
	/**
	 * Visit a parse tree produced by {@link bjcc_idrnParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(@NotNull bjcc_idrnParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link bjcc_idrnParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull bjcc_idrnParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link bjcc_idrnParser#mainClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainClass(@NotNull bjcc_idrnParser.MainClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link bjcc_idrnParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(@NotNull bjcc_idrnParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link bjcc_idrnParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull bjcc_idrnParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link bjcc_idrnParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(@NotNull bjcc_idrnParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link bjcc_idrnParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(@NotNull bjcc_idrnParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link bjcc_idrnParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(@NotNull bjcc_idrnParser.VarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link bjcc_idrnParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(@NotNull bjcc_idrnParser.ClassDeclarationContext ctx);
}