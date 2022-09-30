package com.ibm.dip.model.current account;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.current account.ExecuteDepositsandWithdrawalsResponseDepositsandWithdrawals;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ExecuteDepositsandWithdrawalsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-09-30T10:27:35.098Z[GMT]")

public class ExecuteDepositsandWithdrawalsResponse   {
  @JsonProperty("DepositsandWithdrawals")
  private ExecuteDepositsandWithdrawalsResponseDepositsandWithdrawals depositsandWithdrawals;

  public ExecuteDepositsandWithdrawalsResponse depositsandWithdrawals(ExecuteDepositsandWithdrawalsResponseDepositsandWithdrawals depositsandWithdrawals) {
    this.depositsandWithdrawals = depositsandWithdrawals;
    return this;
  }

  /**
   * Get depositsandWithdrawals
   * @return depositsandWithdrawals
  */
  @ApiModelProperty(value = "")

  @Valid

  public ExecuteDepositsandWithdrawalsResponseDepositsandWithdrawals getDepositsandWithdrawals() {
    return depositsandWithdrawals;
  }

  public void setDepositsandWithdrawals(ExecuteDepositsandWithdrawalsResponseDepositsandWithdrawals depositsandWithdrawals) {
    this.depositsandWithdrawals = depositsandWithdrawals;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExecuteDepositsandWithdrawalsResponse executeDepositsandWithdrawalsResponse = (ExecuteDepositsandWithdrawalsResponse) o;
    return Objects.equals(this.depositsandWithdrawals, executeDepositsandWithdrawalsResponse.depositsandWithdrawals);
  }

  @Override
  public int hashCode() {
    return Objects.hash(depositsandWithdrawals);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecuteDepositsandWithdrawalsResponse {\n");
    
    sb.append("    depositsandWithdrawals: ").append(toIndentedString(depositsandWithdrawals)).append("\n");
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

