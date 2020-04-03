package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Header;
import io.swagger.model.PaymentBill;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ListResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-20T16:20:35.844Z[GMT]")
public class ListResponse   {
  @JsonProperty("header")
  private Header header = null;

  @JsonProperty("paymentBill")
  @Valid
  private List<PaymentBill> paymentBill = null;

  public ListResponse header(Header header) {
    this.header = header;
    return this;
  }

  /**
   * Get header
   * @return header
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public Header getHeader() {
    return header;
  }

  public void setHeader(Header header) {
    this.header = header;
  }

  public ListResponse paymentBill(List<PaymentBill> paymentBill) {
    this.paymentBill = paymentBill;
    return this;
  }

  public ListResponse addPaymentBillItem(PaymentBill paymentBillItem) {
    if (this.paymentBill == null) {
      this.paymentBill = new ArrayList<PaymentBill>();
    }
    this.paymentBill.add(paymentBillItem);
    return this;
  }

  /**
   * Get paymentBill
   * @return paymentBill
  **/
  @ApiModelProperty(value = "")
      @Valid
    public List<PaymentBill> getPaymentBill() {
    return paymentBill;
  }

  public void setPaymentBill(List<PaymentBill> paymentBill) {
    this.paymentBill = paymentBill;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListResponse listResponse = (ListResponse) o;
    return Objects.equals(this.header, listResponse.header) &&
        Objects.equals(this.paymentBill, listResponse.paymentBill);
  }

  @Override
  public int hashCode() {
    return Objects.hash(header, paymentBill);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListResponse {\n");
    
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    paymentBill: ").append(toIndentedString(paymentBill)).append("\n");
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
