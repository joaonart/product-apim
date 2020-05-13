/*
 * WSO2 API Manager - Admin
 * This document specifies a **RESTful API** for WSO2 **API Manager** - Admin Portal. Please see [full swagger definition](https://raw.githubusercontent.com/wso2/carbon-apimgt/v6.5.176/components/apimgt/org.wso2.carbon.apimgt.rest.api.admin/src/main/resources/admin-api.yaml) of the API which is written using [swagger 2.0](http://swagger.io/) specification. 
 *
 * OpenAPI spec version: 0.16.0
 * Contact: architecture@wso2.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.wso2.am.integration.clients.admin.api.dto;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.wso2.am.integration.clients.admin.api.dto.ThrottleConditionDTO;

/**
 * HeaderConditionDTO
 */

public class HeaderConditionDTO extends ThrottleConditionDTO {
  @SerializedName("headerName")
  private String headerName = null;

  @SerializedName("headerValue")
  private String headerValue = null;

  public HeaderConditionDTO headerName(String headerName) {
    this.headerName = headerName;
    return this;
  }

   /**
   * Name of the header
   * @return headerName
  **/
  @ApiModelProperty(value = "Name of the header")
  public String getHeaderName() {
    return headerName;
  }

  public void setHeaderName(String headerName) {
    this.headerName = headerName;
  }

  public HeaderConditionDTO headerValue(String headerValue) {
    this.headerValue = headerValue;
    return this;
  }

   /**
   * Value of the header
   * @return headerValue
  **/
  @ApiModelProperty(value = "Value of the header")
  public String getHeaderValue() {
    return headerValue;
  }

  public void setHeaderValue(String headerValue) {
    this.headerValue = headerValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HeaderConditionDTO headerCondition = (HeaderConditionDTO) o;
    return Objects.equals(this.headerName, headerCondition.headerName) &&
        Objects.equals(this.headerValue, headerCondition.headerValue) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(headerName, headerValue, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HeaderConditionDTO {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    headerName: ").append(toIndentedString(headerName)).append("\n");
    sb.append("    headerValue: ").append(toIndentedString(headerValue)).append("\n");
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
