package io.swagger.dataBuilder;

import io.swagger.model.GenericResponse;
import io.swagger.model.Header;

public final class GenericResponseBuilder {
    private String code = null;
    private String id = null;
    private Header header = null;

    private GenericResponseBuilder() {
        this.code = "0000";
        this.id = "XXXX-XXXXX-XXXX";
        this.header = HeaderBuilder.aHeader().build();
    }

    public static GenericResponseBuilder aGenericResponse() {
        return new GenericResponseBuilder();
    }

    public GenericResponseBuilder withCode(String code) {
        this.code = code;
        return this;
    }

    public GenericResponseBuilder withId(String id) {
        this.id = id;
        return this;
    }

    public GenericResponseBuilder withHeader(Header header) {
        this.header = header;
        return this;
    }

    public GenericResponse build() {
        GenericResponse genericResponse = new GenericResponse();
        genericResponse.setCode(code);
        genericResponse.setId(id);
        genericResponse.setHeader(header);
        return genericResponse;
    }
}
