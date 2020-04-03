package io.swagger.dataBuilder;

import io.swagger.model.CreateRequest;
import io.swagger.model.Header;

import java.math.BigDecimal;

public final class CreateRequestBuilder {
    private String clientDocument = null;
    private String clientDocumentType = null;
    private String name = null;
    private String date = null;
    private Integer frequency = null;
    private String amount = null;
    private String originAccountNumber = null;
    private String originAccountType = null;
    private String destinationAccountNumber = null;
    private String destinationAccountType = null;
    private String description = null;
    private Header header = null;

    private CreateRequestBuilder() {
        this.clientDocument = "45134951";
        this.clientDocumentType = "CC";
        this.name = "NN";
        this.date = "2019/04/15";
        this.frequency = 3;
        this.amount = "12.111";
        this.originAccountNumber = "356543";
        this.originAccountType = "Ahorros";
        this.destinationAccountNumber = "23765432465654";
        this.destinationAccountType = "Ahorros";
        this.description = "hola";
        this.header = HeaderBuilder.aHeader().build();
    }

    public static CreateRequestBuilder aCreateRequest() {
        return new CreateRequestBuilder();
    }

    public CreateRequestBuilder withClientDocument(String clientDocument) {
        this.clientDocument = clientDocument;
        return this;
    }

    public CreateRequestBuilder withClientDocumentType(String clientDocumentType) {
        this.clientDocumentType = clientDocumentType;
        return this;
    }

    public CreateRequestBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public CreateRequestBuilder withDate(String date) {
        this.date = date;
        return this;
    }

    public CreateRequestBuilder withFrequency(Integer frequency) {
        this.frequency = frequency;
        return this;
    }

    public CreateRequestBuilder withAmount(String amount) {
        this.amount = amount;
        return this;
    }

    public CreateRequestBuilder withOriginAccountNumber(String originAccountNumber) {
        this.originAccountNumber = originAccountNumber;
        return this;
    }

    public CreateRequestBuilder withOriginAccountType(String originAccountType) {
        this.originAccountType = originAccountType;
        return this;
    }

    public CreateRequestBuilder withDestinationAccountNumber(String destinationAccountNumber) {
        this.destinationAccountNumber = destinationAccountNumber;
        return this;
    }

    public CreateRequestBuilder withDestinationAccountType(String destinationAccountType) {
        this.destinationAccountType = destinationAccountType;
        return this;
    }

    public CreateRequestBuilder withDescription(String description) {
        this.description = description;
        return this;
    }

    public CreateRequestBuilder withHeader(Header header) {
        this.header = header;
        return this;
    }

    public CreateRequest build() {
        CreateRequest createRequest = new CreateRequest();
        createRequest.setClientDocument(clientDocument);
        createRequest.setClientDocumentType(clientDocumentType);
        createRequest.setName(name);
        createRequest.setDate(date);
        createRequest.setFrequency(frequency);
        createRequest.setAmount(amount);
        createRequest.setOriginAccountNumber(originAccountNumber);
        createRequest.setOriginAccountType(originAccountType);
        createRequest.setDestinationAccountNumber(destinationAccountNumber);
        createRequest.setDestinationAccountType(destinationAccountType);
        createRequest.setDescription(description);
        createRequest.setHeader(header);
        return createRequest;
    }
}
