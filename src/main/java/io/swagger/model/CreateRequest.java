package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * CreateRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-20T16:20:35.844Z[GMT]")
public class CreateRequest {
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

    @JsonProperty("header")
    private Header header = null;

    public CreateRequest clientDocument(String clientDocument) {
        this.clientDocument = clientDocument;
        return this;
    }

    /**
     * Get clientDocument
     *
     * @return clientDocument
     **/
    @ApiModelProperty(required = true, value = "")
    @NotNull

    public String getClientDocument() {
        return clientDocument;
    }

    public void setClientDocument(String clientDocument) {
        this.clientDocument = clientDocument;
    }

    public CreateRequest clientDocumentType(String clientDocumentType) {
        this.clientDocumentType = clientDocumentType;
        return this;
    }

    /**
     * Get clientDocumentType
     *
     * @return clientDocumentType
     **/
    @ApiModelProperty(required = true, value = "")
    @NotNull

    public String getClientDocumentType() {
        return clientDocumentType;
    }

    public void setClientDocumentType(String clientDocumentType) {
        this.clientDocumentType = clientDocumentType;
    }

    public CreateRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     *
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

    public CreateRequest date(String date) {
        this.date = date;
        return this;
    }

    /**
     * Get date
     *
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

    public CreateRequest frequency(Integer frequency) {
        this.frequency = frequency;
        return this;
    }

    /**
     * Get frequency
     *
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

    public CreateRequest amount(String amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Get amount
     *
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

    public CreateRequest originAccountNumber(String originAccountNumber) {
        this.originAccountNumber = originAccountNumber;
        return this;
    }

    /**
     * Get originAccountNumber
     *
     * @return originAccountNumber
     **/
    @ApiModelProperty(required = true, value = "")
    @NotNull

    public String getOriginAccountNumber() {
        return originAccountNumber;
    }

    public void setOriginAccountNumber(String originAccountNumber) {
        this.originAccountNumber = originAccountNumber;
    }

    public CreateRequest originAccountType(String originAccountType) {
        this.originAccountType = originAccountType;
        return this;
    }

    /**
     * Get originAccountType
     *
     * @return originAccountType
     **/
    @ApiModelProperty(required = true, value = "")
    @NotNull

    public String getOriginAccountType() {
        return originAccountType;
    }

    public void setOriginAccountType(String originAccountType) {
        this.originAccountType = originAccountType;
    }

    public CreateRequest destinationAccountNumber(String destinationAccountNumber) {
        this.destinationAccountNumber = destinationAccountNumber;
        return this;
    }

    /**
     * Get destinationAccountNumber
     *
     * @return destinationAccountNumber
     **/
    @ApiModelProperty(required = true, value = "")
    @NotNull

    public String getDestinationAccountNumber() {
        return destinationAccountNumber;
    }

    public void setDestinationAccountNumber(String destinationAccountNumber) {
        this.destinationAccountNumber = destinationAccountNumber;
    }

    public CreateRequest destinationAccountType(String destinationAccountType) {
        this.destinationAccountType = destinationAccountType;
        return this;
    }

    /**
     * Get destinationAccountType
     *
     * @return destinationAccountType
     **/
    @ApiModelProperty(required = true, value = "")
    @NotNull

    public String getDestinationAccountType() {
        return destinationAccountType;
    }

    public void setDestinationAccountType(String destinationAccountType) {
        this.destinationAccountType = destinationAccountType;
    }

    public CreateRequest description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     *
     * @return description
     **/
    @ApiModelProperty(value = "")

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateRequest header(Header header) {
        this.header = header;
        return this;
    }

    /**
     * Get header
     *
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
        CreateRequest createRequest = (CreateRequest) o;
        return Objects.equals(this.clientDocument, createRequest.clientDocument) &&
                Objects.equals(this.clientDocumentType, createRequest.clientDocumentType) &&
                Objects.equals(this.name, createRequest.name) &&
                Objects.equals(this.date, createRequest.date) &&
                Objects.equals(this.frequency, createRequest.frequency) &&
                Objects.equals(this.amount, createRequest.amount) &&
                Objects.equals(this.originAccountNumber, createRequest.originAccountNumber) &&
                Objects.equals(this.originAccountType, createRequest.originAccountType) &&
                Objects.equals(this.destinationAccountNumber, createRequest.destinationAccountNumber) &&
                Objects.equals(this.destinationAccountType, createRequest.destinationAccountType) &&
                Objects.equals(this.description, createRequest.description) &&
                Objects.equals(this.header, createRequest.header);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientDocument, clientDocumentType, name, date, frequency, amount, originAccountNumber, originAccountType, destinationAccountNumber, destinationAccountType, description, header);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateRequest {\n");

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
