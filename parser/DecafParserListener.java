// Generated from parser/DecafParser.g by ANTLR 4.1

package compiler.parser;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DecafParser}.
 */
public interface DecafParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DecafParser#assing_op}.
	 * @param ctx the parse tree
	 */
	void enterAssing_op(@NotNull DecafParser.Assing_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#assing_op}.
	 * @param ctx the parse tree
	 */
	void exitAssing_op(@NotNull DecafParser.Assing_opContext ctx);

	/**
	 * Enter a parse tree produced by {@link DecafParser#location}.
	 * @param ctx the parse tree
	 */
	void enterLocation(@NotNull DecafParser.LocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#location}.
	 * @param ctx the parse tree
	 */
	void exitLocation(@NotNull DecafParser.LocationContext ctx);

	/**
	 * Enter a parse tree produced by {@link DecafParser#method_name}.
	 * @param ctx the parse tree
	 */
	void enterMethod_name(@NotNull DecafParser.Method_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#method_name}.
	 * @param ctx the parse tree
	 */
	void exitMethod_name(@NotNull DecafParser.Method_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link DecafParser#class}.
	 * @param ctx the parse tree
	 */
	void enterClass(@NotNull DecafParser.ClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#class}.
	 * @param ctx the parse tree
	 */
	void exitClass(@NotNull DecafParser.ClassContext ctx);

	/**
	 * Enter a parse tree produced by {@link DecafParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull DecafParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull DecafParser.BlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link DecafParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull DecafParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull DecafParser.ExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link DecafParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void enterBin_op(@NotNull DecafParser.Bin_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void exitBin_op(@NotNull DecafParser.Bin_opContext ctx);

	/**
	 * Enter a parse tree produced by {@link DecafParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(@NotNull DecafParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(@NotNull DecafParser.Var_declContext ctx);

	/**
	 * Enter a parse tree produced by {@link DecafParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull DecafParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull DecafParser.TypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link DecafParser#rel_op}.
	 * @param ctx the parse tree
	 */
	void enterRel_op(@NotNull DecafParser.Rel_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#rel_op}.
	 * @param ctx the parse tree
	 */
	void exitRel_op(@NotNull DecafParser.Rel_opContext ctx);

	/**
	 * Enter a parse tree produced by {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull DecafParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull DecafParser.StatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link DecafParser#var_decl_name}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl_name(@NotNull DecafParser.Var_decl_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#var_decl_name}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl_name(@NotNull DecafParser.Var_decl_nameContext ctx);

	/**
	 * Enter a parse tree produced by {@link DecafParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(@NotNull DecafParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(@NotNull DecafParser.ParametrosContext ctx);

	/**
	 * Enter a parse tree produced by {@link DecafParser#callout_arg}.
	 * @param ctx the parse tree
	 */
	void enterCallout_arg(@NotNull DecafParser.Callout_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#callout_arg}.
	 * @param ctx the parse tree
	 */
	void exitCallout_arg(@NotNull DecafParser.Callout_argContext ctx);

	/**
	 * Enter a parse tree produced by {@link DecafParser#eq_op}.
	 * @param ctx the parse tree
	 */
	void enterEq_op(@NotNull DecafParser.Eq_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#eq_op}.
	 * @param ctx the parse tree
	 */
	void exitEq_op(@NotNull DecafParser.Eq_opContext ctx);

	/**
	 * Enter a parse tree produced by {@link DecafParser#method_call}.
	 * @param ctx the parse tree
	 */
	void enterMethod_call(@NotNull DecafParser.Method_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#method_call}.
	 * @param ctx the parse tree
	 */
	void exitMethod_call(@NotNull DecafParser.Method_callContext ctx);

	/**
	 * Enter a parse tree produced by {@link DecafParser#field_decl}.
	 * @param ctx the parse tree
	 */
	void enterField_decl(@NotNull DecafParser.Field_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#field_decl}.
	 * @param ctx the parse tree
	 */
	void exitField_decl(@NotNull DecafParser.Field_declContext ctx);

	/**
	 * Enter a parse tree produced by {@link DecafParser#cond_op}.
	 * @param ctx the parse tree
	 */
	void enterCond_op(@NotNull DecafParser.Cond_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#cond_op}.
	 * @param ctx the parse tree
	 */
	void exitCond_op(@NotNull DecafParser.Cond_opContext ctx);

	/**
	 * Enter a parse tree produced by {@link DecafParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(@NotNull DecafParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(@NotNull DecafParser.LiteralContext ctx);

	/**
	 * Enter a parse tree produced by {@link DecafParser#method_decl}.
	 * @param ctx the parse tree
	 */
	void enterMethod_decl(@NotNull DecafParser.Method_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#method_decl}.
	 * @param ctx the parse tree
	 */
	void exitMethod_decl(@NotNull DecafParser.Method_declContext ctx);
}