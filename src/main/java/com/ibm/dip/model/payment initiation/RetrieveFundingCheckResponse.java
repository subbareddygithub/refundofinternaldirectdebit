package com.ibm.dip.model.payment initiation;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.payment initiation.RetrieveFundingCheckResponseFundingCheck;
import com.ibm.dip.model.payment initiation.RetrieveFundingCheckResponsePaymentInitiationTransaction;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RetrieveFundingCheckResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-09-30T10:27:21.996Z[GMT]")

public class RetrieveFundingCheckResponse   {
  @JsonProperty("PaymentInitiationTransaction")
  private RetrieveFundingCheckResponsePaymentInitiationTransaction paymentInitiationTransaction;

  @JsonProperty("FundingCheck")
  private RetrieveFundingCheckResponseFundingCheck fundingCheck;

  public RetrieveFundingCheckResponse paymentInitiationTransaction(RetrieveFundingCheckResponsePaymentInitiationTransaction paymentInitiationTransaction) {
    this.paymentInitiationTransaction = paymentInitiationTransaction;
    return this;
  }

  /**
   * Get paymentInitiationTransaction
   * @return paymentInitiationTransaction
  */
  @ApiModelProperty(value = "")

  @Valid

  public RetrieveFundingCheckResponsePaymentInitiationTransaction getPaymentInitiationTransaction() {
    return paymentInitiationTransaction;
  }

  public void setPaymentInitiationTransaction(RetrieveFundingCheckResponsePaymentInitiationTransaction paymentInitiationTransaction) {
    this.paymentInitiationTransaction = paymentInitiationTransaction;
  }

  public RetrieveFundingCheckResponse fundingCheck(RetrieveFundingCheckResponseFundingCheck fundingCheck) {
    this.fundingCheck = fundingCheck;
    return this;
  }

  /**
   * Get fundingCheck
   * @return fundingCheck
  */
  @ApiModelProperty(value = "")

  @Valid

  public RetrieveFundingCheckResponseFundingCheck getFundingCheck() {
    return fundingCheck;
  }

  public void setFundingCheck(RetrieveFundingCheckResponseFundingCheck fundingCheck) {
    this.fundingCheck = fundingCheck;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveFundingCheckResponse retrieveFundingCheckResponse = (RetrieveFundingCheckResponse) o;
    return Objects.equals(this.paymentInitiationTransaction, retrieveFundingCheckResponse.paymentInitiationTransaction) &&
        Objects.equals(this.fundingCheck, retrieveFundingCheckResponse.fundingCheck);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentInitiationTransaction, fundingCheck);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveFundingCheckResponse {\n");
    
    sb.append("    paymentInitiationTransaction: ").append(toIndentedString(paymentInitiationTransaction)).append("\n");
    sb.append("    fundingCheck: ").append(toIndentedString(fundingCheck)).append("\n");
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

