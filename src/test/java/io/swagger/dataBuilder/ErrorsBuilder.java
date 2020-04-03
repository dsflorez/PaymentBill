package io.swagger.dataBuilder;

import io.swagger.model.Errors;

public final class ErrorsBuilder {
    private String code = null;
    private String message = null;

    private ErrorsBuilder() {
    }

    public static ErrorsBuilder anErrors() {
        return new ErrorsBuilder();
    }

    public ErrorsBuilder withCode(String code) {
        this.code = code;
        return this;
    }

    public ErrorsBuilder withMessage(String message) {
        this.message = message;
        return this;
    }

    public Errors build() {
        Errors errors = new Errors();
        errors.setCode(code);
        errors.setMessage(message);
        return errors;
    }
}
