// Generated from parser\DecafParser.g by ANTLR 4.1

package compiler.parser;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DecafParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DecafParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DecafParser#assing_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssing_op(@NotNull DecafParser.Assing_opContext ctx);

	/**
	 * Visit a parse tree produced by {@link DecafParser#location}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocation(@NotNull DecafParser.LocationContext ctx);

	/**
	 * Visit a parse tree produced by {@link DecafParser#method_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_name(@NotNull DecafParser.Method_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link DecafParser#class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass(@NotNull DecafParser.ClassContext ctx);

	/**
	 * Visit a parse tree produced by {@link DecafParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull DecafParser.BlockContext ctx);

	/**
	 * Visit a parse tree produced by {@link DecafParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(@NotNull DecafParser.ExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link DecafParser#bin_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBin_op(@NotNull DecafParser.Bin_opContext ctx);

	/**
	 * Visit a parse tree produced by {@link DecafParser#varDeclID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclID(@NotNull DecafParser.VarDeclIDContext ctx);

	/**
	 * Visit a parse tree produced by {@link DecafParser#var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_decl(@NotNull DecafParser.Var_declContext ctx);

	/**
	 * Visit a parse tree produced by {@link DecafParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(@NotNull DecafParser.TypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link DecafParser#varDeclArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclArray(@NotNull DecafParser.VarDeclArrayContext ctx);

	/**
	 * Visit a parse tree produced by {@link DecafParser#rel_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRel_op(@NotNull DecafParser.Rel_opContext ctx);

	/**
	 * Visit a parse tree produced by {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull DecafParser.StatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link DecafParser#list_var_decl_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_var_decl_name(@NotNull DecafParser.List_var_decl_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link DecafParser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(@NotNull DecafParser.ParametrosContext ctx);

	/**
	 * Visit a parse tree produced by {@link DecafParser#callout_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallout_arg(@NotNull DecafParser.Callout_argContext ctx);

	/**
	 * Visit a parse tree produced by {@link DecafParser#eq_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEq_op(@NotNull DecafParser.Eq_opContext ctx);

	/**
	 * Visit a parse tree produced by {@link DecafParser#method_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_call(@NotNull DecafParser.Method_callContext ctx);

	/**
	 * Visit a parse tree produced by {@link DecafParser#field_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_decl(@NotNull DecafParser.Field_declContext ctx);

	/**
	 * Visit a parse tree produced by {@link DecafParser#cond_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_op(@NotNull DecafParser.Cond_opContext ctx);

	/**
	 * Visit a parse tree produced by {@link DecafParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(@NotNull DecafParser.LiteralContext ctx);

	/**
	 * Visit a parse tree produced by {@link DecafParser#method_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_decl(@NotNull DecafParser.Method_declContext ctx);
}