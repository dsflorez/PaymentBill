package io.swagger.dataBuilder;

import io.swagger.model.PaymentBill;

import java.math.BigDecimal;

public final class PaymentBillBuilder {
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

    private PaymentBillBuilder() {
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
    }

    public static PaymentBillBuilder aPaymentBill() {
        return new PaymentBillBuilder();
    }

    public PaymentBillBuilder withClientDocument(String clientDocument) {
        this.clientDocument = clientDocument;
        return this;
    }

    public PaymentBillBuilder withClientDocumentType(String clientDocumentType) {
        this.clientDocumentType = clientDocumentType;
        return this;
    }

    public PaymentBillBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public PaymentBillBuilder withDate(String date) {
        this.date = date;
        return this;
    }

    public PaymentBillBuilder withFrequency(Integer frequency) {
        this.frequency = frequency;
        return this;
    }

    public PaymentBillBuilder withAmount(String amount) {
        this.amount = amount;
        return this;
    }

    public PaymentBillBuilder withOriginAccountNumber(String originAccountNumber) {
        this.originAccountNumber = originAccountNumber;
        return this;
    }

    public PaymentBillBuilder withOriginAccountType(String originAccountType) {
        this.originAccountType = originAccountType;
        return this;
    }

    public PaymentBillBuilder withDestinationAccountNumber(String destinationAccountNumber) {
        this.destinationAccountNumber = destinationAccountNumber;
        return this;
    }

    public PaymentBillBuilder withDestinationAccountType(String destinationAccountType) {
        this.destinationAccountType = destinationAccountType;
        return this;
    }

    public PaymentBillBuilder withDescription(String description) {
        this.description = description;
        return this;
    }

    public PaymentBill build() {
        PaymentBill paymentBill = new PaymentBill();
        paymentBill.setClientDocument(clientDocument);
        paymentBill.setClientDocumentType(clientDocumentType);
        paymentBill.setName(name);
        paymentBill.setDate(date);
        paymentBill.setFrequency(frequency);
        paymentBill.setAmount(amount);
        paymentBill.setOriginAccountNumber(originAccountNumber);
        paymentBill.setOriginAccountType(originAccountType);
        paymentBill.setDestinationAccountNumber(destinationAccountNumber);
        paymentBill.setDestinationAccountType(destinationAccountType);
        paymentBill.setDescription(description);
        return paymentBill;
    }
}
