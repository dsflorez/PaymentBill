package io.swagger.dataBuilder;

import io.swagger.model.Header;

public final class HeaderBuilder {
    private String id = null;
    private String type = null;

    private HeaderBuilder() {
        this.id  = "1002122121";
        this.type = "paymentBill";
    }

    public static HeaderBuilder aHeader() {
        return new HeaderBuilder();
    }

    public HeaderBuilder withId(String id) {
        this.id = id;
        return this;
    }

    public HeaderBuilder withType(String type) {
        this.type = type;
        return this;
    }

    public Header build() {
        Header header = new Header();
        header.setId(id);
        header.setType(type);
        return header;
    }
}
