// Generated from parser/DecafParser.g by ANTLR 4.1

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
	 * Visit a parse tree produced by {@link DecafParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(@NotNull DecafParser.AssignContext ctx);

	/**
	 * Visit a parse tree produced by {@link DecafParser#continue_st}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue_st(@NotNull DecafParser.Continue_stContext ctx);

	/**
	 * Visit a parse tree produced by {@link DecafParser#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(@NotNull DecafParser.MethodCallContext ctx);

	/**
	 * Visit a parse tree produced by {@link DecafParser#location}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocation(@NotNull DecafParser.LocationContext ctx);

	/**
	 * Visit a parse tree produced by {@link DecafParser#bin_op_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBin_op_exp(@NotNull DecafParser.Bin_op_expContext ctx);

	/**
	 * Visit a parse tree produced by {@link DecafParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull DecafParser.BlockContext ctx);

	/**
	 * Visit a parse tree produced by {@link DecafParser#bin_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBin_op(@NotNull DecafParser.Bin_opContext ctx);

	/**
	 * Visit a parse tree produced by {@link DecafParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(@NotNull DecafParser.TypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link DecafParser#rel_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRel_op(@NotNull DecafParser.Rel_opContext ctx);

	/**
	 * Visit a parse tree produced by {@link DecafParser#location_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocation_exp(@NotNull DecafParser.Location_expContext ctx);

	/**
	 * Visit a parse tree produced by {@link DecafParser#var_decl_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_decl_name(@NotNull DecafParser.Var_decl_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link DecafParser#forstmnt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForstmnt(@NotNull DecafParser.ForstmntContext ctx);

	/**
	 * Visit a parse tree produced by {@link DecafParser#method_callout}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_callout(@NotNull DecafParser.Method_calloutContext ctx);

	/**
	 * Visit a parse tree produced by {@link DecafParser#callout_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallout_arg(@NotNull DecafParser.Callout_argContext ctx);

	/**
	 * Visit a parse tree produced by {@link DecafParser#plusMin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusMin(@NotNull DecafParser.PlusMinContext ctx);

	/**
	 * Visit a parse tree produced by {@link DecafParser#multDiv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultDiv(@NotNull DecafParser.MultDivContext ctx);

	/**
	 * Visit a parse tree produced by {@link DecafParser#return_st}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_st(@NotNull DecafParser.Return_stContext ctx);

	/**
	 * Visit a parse tree produced by {@link DecafParser#neg_sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNeg_sign(@NotNull DecafParser.Neg_signContext ctx);

	/**
	 * Visit a parse tree produced by {@link DecafParser#cond_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_op(@NotNull DecafParser.Cond_opContext ctx);

	/**
	 * Visit a parse tree produced by {@link DecafParser#literal_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_exp(@NotNull DecafParser.Literal_expContext ctx);

	/**
	 * Visit a parse tree produced by {@link DecafParser#method_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_exp(@NotNull DecafParser.Method_expContext ctx);

	/**
	 * Visit a parse tree produced by {@link DecafParser#not_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot_expr(@NotNull DecafParser.Not_exprContext ctx);

	/**
	 * Visit a parse tree produced by {@link DecafParser#class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass(@NotNull DecafParser.ClassContext ctx);

	/**
	 * Visit a parse tree produced by {@link DecafParser#var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_decl(@NotNull DecafParser.Var_declContext ctx);

	/**
	 * Visit a parse tree produced by {@link DecafParser#break_st}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_st(@NotNull DecafParser.Break_stContext ctx);

	/**
	 * Visit a parse tree produced by {@link DecafParser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(@NotNull DecafParser.ParametrosContext ctx);

	/**
	 * Visit a parse tree produced by {@link DecafParser#method_call1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_call1(@NotNull DecafParser.Method_call1Context ctx);

	/**
	 * Visit a parse tree produced by {@link DecafParser#ifstmnt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfstmnt(@NotNull DecafParser.IfstmntContext ctx);

	/**
	 * Visit a parse tree produced by {@link DecafParser#block_st}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_st(@NotNull DecafParser.Block_stContext ctx);

	/**
	 * Visit a parse tree produced by {@link DecafParser#eq_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEq_op(@NotNull DecafParser.Eq_opContext ctx);

	/**
	 * Visit a parse tree produced by {@link DecafParser#field_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_decl(@NotNull DecafParser.Field_declContext ctx);

	/**
	 * Visit a parse tree produced by {@link DecafParser#param_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_decl(@NotNull DecafParser.Param_declContext ctx);

	/**
	 * Visit a parse tree produced by {@link DecafParser#par_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPar_expr(@NotNull DecafParser.Par_exprContext ctx);

	/**
	 * Visit a parse tree produced by {@link DecafParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(@NotNull DecafParser.LiteralContext ctx);

	/**
	 * Visit a parse tree produced by {@link DecafParser#assign_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_op(@NotNull DecafParser.Assign_opContext ctx);

	/**
	 * Visit a parse tree produced by {@link DecafParser#method_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_decl(@NotNull DecafParser.Method_declContext ctx);
}