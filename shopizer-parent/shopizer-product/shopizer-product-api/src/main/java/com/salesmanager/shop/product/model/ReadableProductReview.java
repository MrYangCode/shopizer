package com.salesmanager.shop.product.model;

import com.salesmanager.shop.model.customer.ReadableCustomer;

import java.io.Serializable;


public class ReadableProductReview extends ProductReviewEntity implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private ReadableCustomer customer;

    public ReadableCustomer getCustomer() {
        return customer;
    }

    public void setCustomer(ReadableCustomer customer) {
        this.customer = customer;
    }

}
