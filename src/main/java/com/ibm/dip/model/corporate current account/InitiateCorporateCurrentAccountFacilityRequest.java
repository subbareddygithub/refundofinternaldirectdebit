package com.ibm.dip.model.corporate current account;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.dip.model.corporate current account.InitiateCorporateCurrentAccountFacilityRequestCorporateCurrentAccountFacility;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InitiateCorporateCurrentAccountFacilityRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-09-30T10:27:28.498Z[GMT]")

public class InitiateCorporateCurrentAccountFacilityRequest   {
  @JsonProperty("CorporateCurrentAccountFacility")
  private InitiateCorporateCurrentAccountFacilityRequestCorporateCurrentAccountFacility corporateCurrentAccountFacility;

  public InitiateCorporateCurrentAccountFacilityRequest corporateCurrentAccountFacility(InitiateCorporateCurrentAccountFacilityRequestCorporateCurrentAccountFacility corporateCurrentAccountFacility) {
    this.corporateCurrentAccountFacility = corporateCurrentAccountFacility;
    return this;
  }

  /**
   * Get corporateCurrentAccountFacility
   * @return corporateCurrentAccountFacility
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateCorporateCurrentAccountFacilityRequestCorporateCurrentAccountFacility getCorporateCurrentAccountFacility() {
    return corporateCurrentAccountFacility;
  }

  public void setCorporateCurrentAccountFacility(InitiateCorporateCurrentAccountFacilityRequestCorporateCurrentAccountFacility corporateCurrentAccountFacility) {
    this.corporateCurrentAccountFacility = corporateCurrentAccountFacility;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateCorporateCurrentAccountFacilityRequest initiateCorporateCurrentAccountFacilityRequest = (InitiateCorporateCurrentAccountFacilityRequest) o;
    return Objects.equals(this.corporateCurrentAccountFacility, initiateCorporateCurrentAccountFacilityRequest.corporateCurrentAccountFacility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(corporateCurrentAccountFacility);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateCorporateCurrentAccountFacilityRequest {\n");
    
    sb.append("    corporateCurrentAccountFacility: ").append(toIndentedString(corporateCurrentAccountFacility)).append("\n");
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

