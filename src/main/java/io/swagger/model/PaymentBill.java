package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PaymentBill
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-20T16:20:35.844Z[GMT]")
public class PaymentBill   {
  @JsonProperty("clientDocument")
  private String clientDocument = null;

  @JsonProperty("clientDocumentType")
  private String clientDocumentType = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("date")
  private String date = null;

  @JsonProperty("frequency")
  private Integer frequency = null;

  @JsonProperty("amount")
  private String amount = null;

  @JsonProperty("originAccountNumber")
  private String originAccountNumber = null;

  @JsonProperty("originAccountType")
  private String originAccountType = null;

  @JsonProperty("destinationAccountNumber")
  private String destinationAccountNumber = null;

  @JsonProperty("destinationAccountType")
  private String destinationAccountType = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("_id")
  private String _id = null;

  @JsonProperty("_rev")
  private String _rev = null;

  public PaymentBill clientDocument(String clientDocument) {
    this.clientDocument = clientDocument;
    return this;
  }

  /**
   * Get clientDocument
   * @return clientDocument
  **/
  @ApiModelProperty(value = "")
  
    public String getClientDocument() {
    return clientDocument;
  }

  public void setClientDocument(String clientDocument) {
    this.clientDocument = clientDocument;
  }

  public PaymentBill clientDocumentType(String clientDocumentType) {
    this.clientDocumentType = clientDocumentType;
    return this;
  }

  /**
   * Get clientDocumentType
   * @return clientDocumentType
  **/
  @ApiModelProperty(value = "")
  
    public String getClientDocumentType() {
    return clientDocumentType;
  }

  public void setClientDocumentType(String clientDocumentType) {
    this.clientDocumentType = clientDocumentType;
  }

  public PaymentBill name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PaymentBill date(String date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(value = "")
  
    public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public PaymentBill frequency(Integer frequency) {
    this.frequency = frequency;
    return this;
  }

  /**
   * Get frequency
   * @return frequency
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public Integer getFrequency() {
    return frequency;
  }

  public void setFrequency(Integer frequency) {
    this.frequency = frequency;
  }

  public PaymentBill amount(String amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(value = "")
  
    public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public PaymentBill originAccountNumber(String originAccountNumber) {
    this.originAccountNumber = originAccountNumber;
    return this;
  }

  /**
   * Get originAccountNumber
   * @return originAccountNumber
  **/
  @ApiModelProperty(value = "")
  
    public String getOriginAccountNumber() {
    return originAccountNumber;
  }

  public void setOriginAccountNumber(String originAccountNumber) {
    this.originAccountNumber = originAccountNumber;
  }

  public PaymentBill originAccountType(String originAccountType) {
    this.originAccountType = originAccountType;
    return this;
  }

  /**
   * Get originAccountType
   * @return originAccountType
  **/
  @ApiModelProperty(value = "")
  
    public String getOriginAccountType() {
    return originAccountType;
  }

  public void setOriginAccountType(String originAccountType) {
    this.originAccountType = originAccountType;
  }

  public PaymentBill destinationAccountNumber(String destinationAccountNumber) {
    this.destinationAccountNumber = destinationAccountNumber;
    return this;
  }

  /**
   * Get destinationAccountNumber
   * @return destinationAccountNumber
  **/
  @ApiModelProperty(value = "")
  
    public String getDestinationAccountNumber() {
    return destinationAccountNumber;
  }

  public void setDestinationAccountNumber(String destinationAccountNumber) {
    this.destinationAccountNumber = destinationAccountNumber;
  }

  public PaymentBill destinationAccountType(String destinationAccountType) {
    this.destinationAccountType = destinationAccountType;
    return this;
  }

  /**
   * Get destinationAccountType
   * @return destinationAccountType
  **/
  @ApiModelProperty(value = "")
  
    public String getDestinationAccountType() {
    return destinationAccountType;
  }

  public void setDestinationAccountType(String destinationAccountType) {
    this.destinationAccountType = destinationAccountType;
  }

  public PaymentBill description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PaymentBill _id(String _id) {
    this._id = _id;
    return this;
  }

  /**
   * Get _id
   * @return _id
  **/
  @ApiModelProperty(value = "")
  
    public String getId() {
    return _id;
  }

  public void setId(String _id) {
    this._id = _id;
  }

  public PaymentBill _rev(String _rev) {
    this._rev = _rev;
    return this;
  }

  /**
   * Get _rev
   * @return _rev
  **/
  @ApiModelProperty(value = "")
  
    public String getRev() {
    return _rev;
  }

  public void setRev(String _rev) {
    this._rev = _rev;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentBill paymentBill = (PaymentBill) o;
    return Objects.equals(this.clientDocument, paymentBill.clientDocument) &&
        Objects.equals(this.clientDocumentType, paymentBill.clientDocumentType) &&
        Objects.equals(this.name, paymentBill.name) &&
        Objects.equals(this.date, paymentBill.date) &&
        Objects.equals(this.frequency, paymentBill.frequency) &&
        Objects.equals(this.amount, paymentBill.amount) &&
        Objects.equals(this.originAccountNumber, paymentBill.originAccountNumber) &&
        Objects.equals(this.originAccountType, paymentBill.originAccountType) &&
        Objects.equals(this.destinationAccountNumber, paymentBill.destinationAccountNumber) &&
        Objects.equals(this.destinationAccountType, paymentBill.destinationAccountType) &&
        Objects.equals(this.description, paymentBill.description) &&
        Objects.equals(this._id, paymentBill._id) &&
        Objects.equals(this._rev, paymentBill._rev);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientDocument, clientDocumentType, name, date, frequency, amount, originAccountNumber, originAccountType, destinationAccountNumber, destinationAccountType, description, _id, _rev);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentBill {\n");
    
    sb.append("    clientDocument: ").append(toIndentedString(clientDocument)).append("\n");
    sb.append("    clientDocumentType: ").append(toIndentedString(clientDocumentType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    originAccountNumber: ").append(toIndentedString(originAccountNumber)).append("\n");
    sb.append("    originAccountType: ").append(toIndentedString(originAccountType)).append("\n");
    sb.append("    destinationAccountNumber: ").append(toIndentedString(destinationAccountNumber)).append("\n");
    sb.append("    destinationAccountType: ").append(toIndentedString(destinationAccountType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    _id: ").append(toIndentedString(_id)).append("\n");
    sb.append("    _rev: ").append(toIndentedString(_rev)).append("\n");
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
