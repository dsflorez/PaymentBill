package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Header;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdateRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-20T16:20:35.844Z[GMT]")
public class UpdateRequest   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("date")
  private String date = null;

  @JsonProperty("frequency")
  private Integer frequency = null;

  @JsonProperty("amount")
  private String amount = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("header")
  private Header header = null;

  public UpdateRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UpdateRequest date(String date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public UpdateRequest frequency(Integer frequency) {
    this.frequency = frequency;
    return this;
  }

  /**
   * Get frequency
   * @return frequency
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public Integer getFrequency() {
    return frequency;
  }

  public void setFrequency(Integer frequency) {
    this.frequency = frequency;
  }

  public UpdateRequest amount(String amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public UpdateRequest id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public UpdateRequest header(Header header) {
    this.header = header;
    return this;
  }

  /**
   * Get header
   * @return header
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public Header getHeader() {
    return header;
  }

  public void setHeader(Header header) {
    this.header = header;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateRequest updateRequest = (UpdateRequest) o;
    return Objects.equals(this.name, updateRequest.name) &&
        Objects.equals(this.date, updateRequest.date) &&
        Objects.equals(this.frequency, updateRequest.frequency) &&
        Objects.equals(this.amount, updateRequest.amount) &&
        Objects.equals(this.id, updateRequest.id) &&
        Objects.equals(this.header, updateRequest.header);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, date, frequency, amount, id, header);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
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
