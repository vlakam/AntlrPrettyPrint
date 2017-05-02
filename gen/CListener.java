// Generated from /home/petrovich/Downloads/antlr/src/C.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CParser}.
 */
public interface CListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(CParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(CParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#include}.
	 * @param ctx the parse tree
	 */
	void enterInclude(CParser.IncludeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#include}.
	 * @param ctx the parse tree
	 */
	void exitInclude(CParser.IncludeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(CParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(CParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(CParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(CParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(CParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(CParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#assignOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignOperator(CParser.AssignOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#assignOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignOperator(CParser.AssignOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#assignExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignExpression(CParser.AssignExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#assignExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignExpression(CParser.AssignExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterConditional(CParser.ConditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitConditional(CParser.ConditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#orCondition}.
	 * @param ctx the parse tree
	 */
	void enterOrCondition(CParser.OrConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#orCondition}.
	 * @param ctx the parse tree
	 */
	void exitOrCondition(CParser.OrConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#andCondition}.
	 * @param ctx the parse tree
	 */
	void enterAndCondition(CParser.AndConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#andCondition}.
	 * @param ctx the parse tree
	 */
	void exitAndCondition(CParser.AndConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#eqCondition}.
	 * @param ctx the parse tree
	 */
	void enterEqCondition(CParser.EqConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#eqCondition}.
	 * @param ctx the parse tree
	 */
	void exitEqCondition(CParser.EqConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#relCondition}.
	 * @param ctx the parse tree
	 */
	void enterRelCondition(CParser.RelConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#relCondition}.
	 * @param ctx the parse tree
	 */
	void exitRelCondition(CParser.RelConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#additive}.
	 * @param ctx the parse tree
	 */
	void enterAdditive(CParser.AdditiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#additive}.
	 * @param ctx the parse tree
	 */
	void exitAdditive(CParser.AdditiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#multiple}.
	 * @param ctx the parse tree
	 */
	void enterMultiple(CParser.MultipleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#multiple}.
	 * @param ctx the parse tree
	 */
	void exitMultiple(CParser.MultipleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#unary}.
	 * @param ctx the parse tree
	 */
	void enterUnary(CParser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#unary}.
	 * @param ctx the parse tree
	 */
	void exitUnary(CParser.UnaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(CParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(CParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(CParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(CParser.ConstantContext ctx);
}