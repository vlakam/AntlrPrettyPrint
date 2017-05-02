// Generated from /home/petrovich/Downloads/antlr/src/C.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(CParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#include}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclude(CParser.IncludeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(CParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(CParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(CParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(CParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#assignOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignOperator(CParser.AssignOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#assignExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignExpression(CParser.AssignExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional(CParser.ConditionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#orCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrCondition(CParser.OrConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#andCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndCondition(CParser.AndConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#eqCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqCondition(CParser.EqConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#relCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelCondition(CParser.RelConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#additive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditive(CParser.AdditiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#multiple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiple(CParser.MultipleContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#unary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary(CParser.UnaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(CParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(CParser.ConstantContext ctx);
}