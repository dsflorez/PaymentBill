package io.swagger.dataBuilder;

import io.swagger.model.Header;
import io.swagger.model.UpdateRequest;

public final class UpdateRequestBuilder {
    private String name = null;
    private String date = null;
    private Integer frequency = null;
    private String amount = null;
    private String id = null;
    private Header header = null;

    private UpdateRequestBuilder() {
        this.name = "NN";
        this.date = "2019/04/15";
        this.frequency = 3;
        this.amount = "12.111";
        this.header = HeaderBuilder.aHeader().build();
    }

    public static UpdateRequestBuilder anUpdateRequest() {
        return new UpdateRequestBuilder();
    }

    public UpdateRequestBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public UpdateRequestBuilder withDate(String date) {
        this.date = date;
        return this;
    }

    public UpdateRequestBuilder withFrequency(Integer frequency) {
        this.frequency = frequency;
        return this;
    }

    public UpdateRequestBuilder withAmount(String amount) {
        this.amount = amount;
        return this;
    }

    public UpdateRequestBuilder withId(String id) {
        this.id = id;
        return this;
    }

    public UpdateRequestBuilder withHeader(Header header) {
        this.header = header;
        return this;
    }

    public UpdateRequest build() {
        UpdateRequest updateRequest = new UpdateRequest();
        updateRequest.setName(name);
        updateRequest.setDate(date);
        updateRequest.setFrequency(frequency);
        updateRequest.setAmount(amount);
        updateRequest.setId(id);
        updateRequest.setHeader(header);
        return updateRequest;
    }
}
