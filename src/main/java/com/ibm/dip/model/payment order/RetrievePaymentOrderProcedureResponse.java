package com.ibm.dip.model.payment order;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.payment order.InitiatePaymentOrderProcedureRequestPaymentOrderProcedure;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RetrievePaymentOrderProcedureResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-09-30T10:27:23.595Z[GMT]")

public class RetrievePaymentOrderProcedureResponse   {
  @JsonProperty("PaymentOrderProcedure")
  private InitiatePaymentOrderProcedureRequestPaymentOrderProcedure paymentOrderProcedure;

  public RetrievePaymentOrderProcedureResponse paymentOrderProcedure(InitiatePaymentOrderProcedureRequestPaymentOrderProcedure paymentOrderProcedure) {
    this.paymentOrderProcedure = paymentOrderProcedure;
    return this;
  }

  /**
   * Get paymentOrderProcedure
   * @return paymentOrderProcedure
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiatePaymentOrderProcedureRequestPaymentOrderProcedure getPaymentOrderProcedure() {
    return paymentOrderProcedure;
  }

  public void setPaymentOrderProcedure(InitiatePaymentOrderProcedureRequestPaymentOrderProcedure paymentOrderProcedure) {
    this.paymentOrderProcedure = paymentOrderProcedure;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrievePaymentOrderProcedureResponse retrievePaymentOrderProcedureResponse = (RetrievePaymentOrderProcedureResponse) o;
    return Objects.equals(this.paymentOrderProcedure, retrievePaymentOrderProcedureResponse.paymentOrderProcedure);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentOrderProcedure);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrievePaymentOrderProcedureResponse {\n");
    
    sb.append("    paymentOrderProcedure: ").append(toIndentedString(paymentOrderProcedure)).append("\n");
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

