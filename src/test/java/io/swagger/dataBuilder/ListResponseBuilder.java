package io.swagger.dataBuilder;

import io.swagger.model.Header;
import io.swagger.model.ListResponse;
import io.swagger.model.PaymentBill;

import java.util.Collections;
import java.util.List;

public final class ListResponseBuilder {
    private Header header = null;
    private List<PaymentBill> paymentBill = null;

    private ListResponseBuilder() {
        this.header = HeaderBuilder.aHeader().build();
        this.paymentBill = Collections.singletonList(PaymentBillBuilder.aPaymentBill().build());
    }

    public static ListResponseBuilder aListResponse() {
        return new ListResponseBuilder();
    }

    public ListResponseBuilder withHeader(Header header) {
        this.header = header;
        return this;
    }

    public ListResponseBuilder withPaymentBill(List<PaymentBill> paymentBill) {
        this.paymentBill = paymentBill;
        return this;
    }

    public ListResponse build() {
        ListResponse listResponse = new ListResponse();
        listResponse.setHeader(header);
        listResponse.setPaymentBill(paymentBill);
        return listResponse;
    }
}
