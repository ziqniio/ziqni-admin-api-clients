/*
 * Ziqni Admin Api
 * Ziqni Application Services are used to manage and configure spaces.
 *
 * The version of the OpenAPI document: 3.0.1
 * Contact: support@ziqni.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ziqni.admin.client.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.ziqni.admin.client.model.RuleRoutine;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A conditional expressions is an element that declares either a rule expression, condition or routine to be evaluated or executed
 */
@ApiModel(description = "A conditional expressions is an element that declares either a rule expression, condition or routine to be evaluated or executed")
@JsonPropertyOrder({
  RuleExpression.JSON_PROPERTY_TYPE,
  RuleExpression.JSON_PROPERTY_MUST_MATCH_ALL,
  RuleExpression.JSON_PROPERTY_MUST_EVALUATE_TO,
  RuleExpression.JSON_PROPERTY_SCOPE,
  RuleExpression.JSON_PROPERTY_OPERAND,
  RuleExpression.JSON_PROPERTY_OPERATOR,
  RuleExpression.JSON_PROPERTY_VALUE,
  RuleExpression.JSON_PROPERTY_RULES,
  RuleExpression.JSON_PROPERTY_THEN,
  RuleExpression.JSON_PROPERTY_LINE_NUMBER
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RuleExpression {
  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_MUST_MATCH_ALL = "mustMatchAll";
  private Boolean mustMatchAll;

  public static final String JSON_PROPERTY_MUST_EVALUATE_TO = "mustEvaluateTo";
  private Boolean mustEvaluateTo;

  public static final String JSON_PROPERTY_SCOPE = "scope";
  private String scope;

  public static final String JSON_PROPERTY_OPERAND = "operand";
  private String operand;

  public static final String JSON_PROPERTY_OPERATOR = "operator";
  private String operator;

  public static final String JSON_PROPERTY_VALUE = "value";
  private String value;

  public static final String JSON_PROPERTY_RULES = "rules";
  private List<RuleExpression> rules = null;

  public static final String JSON_PROPERTY_THEN = "then";
  private List<RuleRoutine> then = null;

  public static final String JSON_PROPERTY_LINE_NUMBER = "lineNumber";
  private Integer lineNumber;


  public RuleExpression type(String type) {
    this.type = type;
    return this;
  }

   /**
   * condition or expression or routine
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "condition or expression or routine")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(String type) {
    this.type = type;
  }


  public RuleExpression mustMatchAll(Boolean mustMatchAll) {
    this.mustMatchAll = mustMatchAll;
    return this;
  }

   /**
   * All expressions in the condition must either evaluate to TRUE or FALSE if set to TRUE
   * @return mustMatchAll
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "All expressions in the condition must either evaluate to TRUE or FALSE if set to TRUE")
  @JsonProperty(JSON_PROPERTY_MUST_MATCH_ALL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMustMatchAll() {
    return mustMatchAll;
  }


  @JsonProperty(JSON_PROPERTY_MUST_MATCH_ALL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMustMatchAll(Boolean mustMatchAll) {
    this.mustMatchAll = mustMatchAll;
  }


  public RuleExpression mustEvaluateTo(Boolean mustEvaluateTo) {
    this.mustEvaluateTo = mustEvaluateTo;
    return this;
  }

   /**
   * All the expressions of this condition must either evaluate to TRUE or FALSE
   * @return mustEvaluateTo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "All the expressions of this condition must either evaluate to TRUE or FALSE")
  @JsonProperty(JSON_PROPERTY_MUST_EVALUATE_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMustEvaluateTo() {
    return mustEvaluateTo;
  }


  @JsonProperty(JSON_PROPERTY_MUST_EVALUATE_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMustEvaluateTo(Boolean mustEvaluateTo) {
    this.mustEvaluateTo = mustEvaluateTo;
  }


  public RuleExpression scope(String scope) {
    this.scope = scope;
    return this;
  }

   /**
   * The scope of the operand used in the expression
   * @return scope
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The scope of the operand used in the expression")
  @JsonProperty(JSON_PROPERTY_SCOPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getScope() {
    return scope;
  }


  @JsonProperty(JSON_PROPERTY_SCOPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScope(String scope) {
    this.scope = scope;
  }


  public RuleExpression operand(String operand) {
    this.operand = operand;
    return this;
  }

   /**
   * The order the rules have to be executed in.
   * @return operand
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The order the rules have to be executed in.")
  @JsonProperty(JSON_PROPERTY_OPERAND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOperand() {
    return operand;
  }


  @JsonProperty(JSON_PROPERTY_OPERAND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOperand(String operand) {
    this.operand = operand;
  }


  public RuleExpression operator(String operator) {
    this.operator = operator;
    return this;
  }

   /**
   * [ *.* ] or [ .* ] or [ &#x3D;&#x3D; ] or [ &gt; ] or [ &gt;&#x3D; ] or [ &lt;&#x3D;]  or [ &lt; ] or [ &lt;&gt; ]
   * @return operator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "[ *.* ] or [ .* ] or [ == ] or [ > ] or [ >= ] or [ <=]  or [ < ] or [ <> ]")
  @JsonProperty(JSON_PROPERTY_OPERATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOperator() {
    return operator;
  }


  @JsonProperty(JSON_PROPERTY_OPERATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOperator(String operator) {
    this.operator = operator;
  }


  public RuleExpression value(String value) {
    this.value = value;
    return this;
  }

   /**
   * The value associated with the expression
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The value associated with the expression")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValue(String value) {
    this.value = value;
  }


  public RuleExpression rules(List<RuleExpression> rules) {
    this.rules = rules;
    return this;
  }

  public RuleExpression addRulesItem(RuleExpression rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<>();
    }
    this.rules.add(rulesItem);
    return this;
  }

   /**
   * Get rules
   * @return rules
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RuleExpression> getRules() {
    return rules;
  }


  @JsonProperty(JSON_PROPERTY_RULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRules(List<RuleExpression> rules) {
    this.rules = rules;
  }


  public RuleExpression then(List<RuleRoutine> then) {
    this.then = then;
    return this;
  }

  public RuleExpression addThenItem(RuleRoutine thenItem) {
    if (this.then == null) {
      this.then = new ArrayList<>();
    }
    this.then.add(thenItem);
    return this;
  }

   /**
   * Get then
   * @return then
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_THEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RuleRoutine> getThen() {
    return then;
  }


  @JsonProperty(JSON_PROPERTY_THEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThen(List<RuleRoutine> then) {
    this.then = then;
  }


  public RuleExpression lineNumber(Integer lineNumber) {
    this.lineNumber = lineNumber;
    return this;
  }

   /**
   * Get lineNumber
   * @return lineNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LINE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLineNumber() {
    return lineNumber;
  }


  @JsonProperty(JSON_PROPERTY_LINE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLineNumber(Integer lineNumber) {
    this.lineNumber = lineNumber;
  }


  /**
   * Return true if this RuleExpression object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RuleExpression ruleExpression = (RuleExpression) o;
    return Objects.equals(this.type, ruleExpression.type) &&
        Objects.equals(this.mustMatchAll, ruleExpression.mustMatchAll) &&
        Objects.equals(this.mustEvaluateTo, ruleExpression.mustEvaluateTo) &&
        Objects.equals(this.scope, ruleExpression.scope) &&
        Objects.equals(this.operand, ruleExpression.operand) &&
        Objects.equals(this.operator, ruleExpression.operator) &&
        Objects.equals(this.value, ruleExpression.value) &&
        Objects.equals(this.rules, ruleExpression.rules) &&
        Objects.equals(this.then, ruleExpression.then) &&
        Objects.equals(this.lineNumber, ruleExpression.lineNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, mustMatchAll, mustEvaluateTo, scope, operand, operator, value, rules, then, lineNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuleExpression {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    mustMatchAll: ").append(toIndentedString(mustMatchAll)).append("\n");
    sb.append("    mustEvaluateTo: ").append(toIndentedString(mustEvaluateTo)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    operand: ").append(toIndentedString(operand)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    then: ").append(toIndentedString(then)).append("\n");
    sb.append("    lineNumber: ").append(toIndentedString(lineNumber)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

