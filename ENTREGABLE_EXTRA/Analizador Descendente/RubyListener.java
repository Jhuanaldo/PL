// Generated from Ruby.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RubyParser}.
 */
public interface RubyListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RubyParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(RubyParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(RubyParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void enterExpression_list(RubyParser.Expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void exitExpression_list(RubyParser.Expression_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(RubyParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(RubyParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#class_block}.
	 * @param ctx the parse tree
	 */
	void enterClass_block(RubyParser.Class_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#class_block}.
	 * @param ctx the parse tree
	 */
	void exitClass_block(RubyParser.Class_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#class_body}.
	 * @param ctx the parse tree
	 */
	void enterClass_body(RubyParser.Class_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#class_body}.
	 * @param ctx the parse tree
	 */
	void exitClass_body(RubyParser.Class_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#attr_definition}.
	 * @param ctx the parse tree
	 */
	void enterAttr_definition(RubyParser.Attr_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#attr_definition}.
	 * @param ctx the parse tree
	 */
	void exitAttr_definition(RubyParser.Attr_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#attr_ids}.
	 * @param ctx the parse tree
	 */
	void enterAttr_ids(RubyParser.Attr_idsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#attr_ids}.
	 * @param ctx the parse tree
	 */
	void exitAttr_ids(RubyParser.Attr_idsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#require_block}.
	 * @param ctx the parse tree
	 */
	void enterRequire_block(RubyParser.Require_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#require_block}.
	 * @param ctx the parse tree
	 */
	void exitRequire_block(RubyParser.Require_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#function_definition}.
	 * @param ctx the parse tree
	 */
	void enterFunction_definition(RubyParser.Function_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#function_definition}.
	 * @param ctx the parse tree
	 */
	void exitFunction_definition(RubyParser.Function_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#function_definition_body}.
	 * @param ctx the parse tree
	 */
	void enterFunction_definition_body(RubyParser.Function_definition_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#function_definition_body}.
	 * @param ctx the parse tree
	 */
	void exitFunction_definition_body(RubyParser.Function_definition_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#function_definition_header}.
	 * @param ctx the parse tree
	 */
	void enterFunction_definition_header(RubyParser.Function_definition_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#function_definition_header}.
	 * @param ctx the parse tree
	 */
	void exitFunction_definition_header(RubyParser.Function_definition_headerContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(RubyParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(RubyParser.Function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#function_definition_params}.
	 * @param ctx the parse tree
	 */
	void enterFunction_definition_params(RubyParser.Function_definition_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#function_definition_params}.
	 * @param ctx the parse tree
	 */
	void exitFunction_definition_params(RubyParser.Function_definition_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#function_definition_params_list}.
	 * @param ctx the parse tree
	 */
	void enterFunction_definition_params_list(RubyParser.Function_definition_params_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#function_definition_params_list}.
	 * @param ctx the parse tree
	 */
	void exitFunction_definition_params_list(RubyParser.Function_definition_params_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#do_statement}.
	 * @param ctx the parse tree
	 */
	void enterDo_statement(RubyParser.Do_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#do_statement}.
	 * @param ctx the parse tree
	 */
	void exitDo_statement(RubyParser.Do_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(RubyParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(RubyParser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(RubyParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(RubyParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#function_call_param_list}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call_param_list(RubyParser.Function_call_param_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#function_call_param_list}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call_param_list(RubyParser.Function_call_param_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#function_call_params}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call_params(RubyParser.Function_call_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#function_call_params}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call_params(RubyParser.Function_call_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#if_elsif_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_elsif_statement(RubyParser.If_elsif_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#if_elsif_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_elsif_statement(RubyParser.If_elsif_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(RubyParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(RubyParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#case_statement}.
	 * @param ctx the parse tree
	 */
	void enterCase_statement(RubyParser.Case_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#case_statement}.
	 * @param ctx the parse tree
	 */
	void exitCase_statement(RubyParser.Case_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#unless_statement}.
	 * @param ctx the parse tree
	 */
	void enterUnless_statement(RubyParser.Unless_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#unless_statement}.
	 * @param ctx the parse tree
	 */
	void exitUnless_statement(RubyParser.Unless_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(RubyParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(RubyParser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#while_expression_list}.
	 * @param ctx the parse tree
	 */
	void enterWhile_expression_list(RubyParser.While_expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#while_expression_list}.
	 * @param ctx the parse tree
	 */
	void exitWhile_expression_list(RubyParser.While_expression_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_statement(RubyParser.For_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_statement(RubyParser.For_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#for_expression_list}.
	 * @param ctx the parse tree
	 */
	void enterFor_expression_list(RubyParser.For_expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#for_expression_list}.
	 * @param ctx the parse tree
	 */
	void exitFor_expression_list(RubyParser.For_expression_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(RubyParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(RubyParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#array_assignment}.
	 * @param ctx the parse tree
	 */
	void enterArray_assignment(RubyParser.Array_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#array_assignment}.
	 * @param ctx the parse tree
	 */
	void exitArray_assignment(RubyParser.Array_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#array_definition}.
	 * @param ctx the parse tree
	 */
	void enterArray_definition(RubyParser.Array_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#array_definition}.
	 * @param ctx the parse tree
	 */
	void exitArray_definition(RubyParser.Array_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#array_definition_elements}.
	 * @param ctx the parse tree
	 */
	void enterArray_definition_elements(RubyParser.Array_definition_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#array_definition_elements}.
	 * @param ctx the parse tree
	 */
	void exitArray_definition_elements(RubyParser.Array_definition_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#array_selector}.
	 * @param ctx the parse tree
	 */
	void enterArray_selector(RubyParser.Array_selectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#array_selector}.
	 * @param ctx the parse tree
	 */
	void exitArray_selector(RubyParser.Array_selectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#int_result}.
	 * @param ctx the parse tree
	 */
	void enterInt_result(RubyParser.Int_resultContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#int_result}.
	 * @param ctx the parse tree
	 */
	void exitInt_result(RubyParser.Int_resultContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#float_result}.
	 * @param ctx the parse tree
	 */
	void enterFloat_result(RubyParser.Float_resultContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#float_result}.
	 * @param ctx the parse tree
	 */
	void exitFloat_result(RubyParser.Float_resultContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#string_result}.
	 * @param ctx the parse tree
	 */
	void enterString_result(RubyParser.String_resultContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#string_result}.
	 * @param ctx the parse tree
	 */
	void exitString_result(RubyParser.String_resultContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void enterLvalue(RubyParser.LvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void exitLvalue(RubyParser.LvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#rvalue}.
	 * @param ctx the parse tree
	 */
	void enterRvalue(RubyParser.RvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#rvalue}.
	 * @param ctx the parse tree
	 */
	void exitRvalue(RubyParser.RvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#literal_t}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_t(RubyParser.Literal_tContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#literal_t}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_t(RubyParser.Literal_tContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#float_t}.
	 * @param ctx the parse tree
	 */
	void enterFloat_t(RubyParser.Float_tContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#float_t}.
	 * @param ctx the parse tree
	 */
	void exitFloat_t(RubyParser.Float_tContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#int_t}.
	 * @param ctx the parse tree
	 */
	void enterInt_t(RubyParser.Int_tContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#int_t}.
	 * @param ctx the parse tree
	 */
	void exitInt_t(RubyParser.Int_tContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#bool_t}.
	 * @param ctx the parse tree
	 */
	void enterBool_t(RubyParser.Bool_tContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#bool_t}.
	 * @param ctx the parse tree
	 */
	void exitBool_t(RubyParser.Bool_tContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#nil_t}.
	 * @param ctx the parse tree
	 */
	void enterNil_t(RubyParser.Nil_tContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#nil_t}.
	 * @param ctx the parse tree
	 */
	void exitNil_t(RubyParser.Nil_tContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(RubyParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(RubyParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#id_global}.
	 * @param ctx the parse tree
	 */
	void enterId_global(RubyParser.Id_globalContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#id_global}.
	 * @param ctx the parse tree
	 */
	void exitId_global(RubyParser.Id_globalContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#id_function}.
	 * @param ctx the parse tree
	 */
	void enterId_function(RubyParser.Id_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#id_function}.
	 * @param ctx the parse tree
	 */
	void exitId_function(RubyParser.Id_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#terminator}.
	 * @param ctx the parse tree
	 */
	void enterTerminator(RubyParser.TerminatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#terminator}.
	 * @param ctx the parse tree
	 */
	void exitTerminator(RubyParser.TerminatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link RubyParser#crlf}.
	 * @param ctx the parse tree
	 */
	void enterCrlf(RubyParser.CrlfContext ctx);
	/**
	 * Exit a parse tree produced by {@link RubyParser#crlf}.
	 * @param ctx the parse tree
	 */
	void exitCrlf(RubyParser.CrlfContext ctx);
}