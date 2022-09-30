package com.ibm.dip.model.payment order;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RetrieveOrderConfirmationResponseOrderConfirmation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-09-30T10:27:23.595Z[GMT]")

public class RetrieveOrderConfirmationResponseOrderConfirmation   {
  @JsonProperty("PaymentOrderComplianceCheckType")
  private String paymentOrderComplianceCheckType;

  @JsonProperty("PaymentOrderComplianceCheckResult")
  private String paymentOrderComplianceCheckResult;

  @JsonProperty("OrderConfirmationTaskResult")
  private String orderConfirmationTaskResult;

  public RetrieveOrderConfirmationResponseOrderConfirmation paymentOrderComplianceCheckType(String paymentOrderComplianceCheckType) {
    this.paymentOrderComplianceCheckType = paymentOrderComplianceCheckType;
    return this;
  }

  /**
   * Get paymentOrderComplianceCheckType
   * @return paymentOrderComplianceCheckType
  */
  @ApiModelProperty(value = "")


  public String getPaymentOrderComplianceCheckType() {
    return paymentOrderComplianceCheckType;
  }

  public void setPaymentOrderComplianceCheckType(String paymentOrderComplianceCheckType) {
    this.paymentOrderComplianceCheckType = paymentOrderComplianceCheckType;
  }

  public RetrieveOrderConfirmationResponseOrderConfirmation paymentOrderComplianceCheckResult(String paymentOrderComplianceCheckResult) {
    this.paymentOrderComplianceCheckResult = paymentOrderComplianceCheckResult;
    return this;
  }

  /**
   * Get paymentOrderComplianceCheckResult
   * @return paymentOrderComplianceCheckResult
  */
  @ApiModelProperty(value = "")


  public String getPaymentOrderComplianceCheckResult() {
    return paymentOrderComplianceCheckResult;
  }

  public void setPaymentOrderComplianceCheckResult(String paymentOrderComplianceCheckResult) {
    this.paymentOrderComplianceCheckResult = paymentOrderComplianceCheckResult;
  }

  public RetrieveOrderConfirmationResponseOrderConfirmation orderConfirmationTaskResult(String orderConfirmationTaskResult) {
    this.orderConfirmationTaskResult = orderConfirmationTaskResult;
    return this;
  }

  /**
   * Get orderConfirmationTaskResult
   * @return orderConfirmationTaskResult
  */
  @ApiModelProperty(value = "")


  public String getOrderConfirmationTaskResult() {
    return orderConfirmationTaskResult;
  }

  public void setOrderConfirmationTaskResult(String orderConfirmationTaskResult) {
    this.orderConfirmationTaskResult = orderConfirmationTaskResult;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveOrderConfirmationResponseOrderConfirmation retrieveOrderConfirmationResponseOrderConfirmation = (RetrieveOrderConfirmationResponseOrderConfirmation) o;
    return Objects.equals(this.paymentOrderComplianceCheckType, retrieveOrderConfirmationResponseOrderConfirmation.paymentOrderComplianceCheckType) &&
        Objects.equals(this.paymentOrderComplianceCheckResult, retrieveOrderConfirmationResponseOrderConfirmation.paymentOrderComplianceCheckResult) &&
        Objects.equals(this.orderConfirmationTaskResult, retrieveOrderConfirmationResponseOrderConfirmation.orderConfirmationTaskResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentOrderComplianceCheckType, paymentOrderComplianceCheckResult, orderConfirmationTaskResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveOrderConfirmationResponseOrderConfirmation {\n");
    
    sb.append("    paymentOrderComplianceCheckType: ").append(toIndentedString(paymentOrderComplianceCheckType)).append("\n");
    sb.append("    paymentOrderComplianceCheckResult: ").append(toIndentedString(paymentOrderComplianceCheckResult)).append("\n");
    sb.append("    orderConfirmationTaskResult: ").append(toIndentedString(orderConfirmationTaskResult)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

