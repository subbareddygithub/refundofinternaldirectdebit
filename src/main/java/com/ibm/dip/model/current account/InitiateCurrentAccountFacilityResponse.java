package com.ibm.dip.model.current account;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.current account.InitiateCurrentAccountFacilityResponseCurrentAccountFacility;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateCurrentAccountFacilityResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-09-30T10:27:35.098Z[GMT]")

public class InitiateCurrentAccountFacilityResponse   {
  @JsonProperty("CurrentAccountFacility")
  private InitiateCurrentAccountFacilityResponseCurrentAccountFacility currentAccountFacility;

  public InitiateCurrentAccountFacilityResponse currentAccountFacility(InitiateCurrentAccountFacilityResponseCurrentAccountFacility currentAccountFacility) {
    this.currentAccountFacility = currentAccountFacility;
    return this;
  }

  /**
   * Get currentAccountFacility
   * @return currentAccountFacility
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateCurrentAccountFacilityResponseCurrentAccountFacility getCurrentAccountFacility() {
    return currentAccountFacility;
  }

  public void setCurrentAccountFacility(InitiateCurrentAccountFacilityResponseCurrentAccountFacility currentAccountFacility) {
    this.currentAccountFacility = currentAccountFacility;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateCurrentAccountFacilityResponse initiateCurrentAccountFacilityResponse = (InitiateCurrentAccountFacilityResponse) o;
    return Objects.equals(this.currentAccountFacility, initiateCurrentAccountFacilityResponse.currentAccountFacility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentAccountFacility);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateCurrentAccountFacilityResponse {\n");
    
    sb.append("    currentAccountFacility: ").append(toIndentedString(currentAccountFacility)).append("\n");
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

