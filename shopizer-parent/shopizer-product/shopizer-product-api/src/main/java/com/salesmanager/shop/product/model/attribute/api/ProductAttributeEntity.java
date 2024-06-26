package com.salesmanager.shop.product.model.attribute.api;

import com.salesmanager.shop.product.model.attribute.ProductAttribute;

import java.io.Serializable;

public class ProductAttributeEntity extends ProductAttribute implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private int sortOrder;
    private boolean attributeDefault = false;
    private boolean attributeDisplayOnly = false;

    public int getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(int sortOrder) {
        this.sortOrder = sortOrder;
    }

    public boolean isAttributeDefault() {
        return attributeDefault;
    }

    public void setAttributeDefault(boolean attributeDefault) {
        this.attributeDefault = attributeDefault;
    }

    public boolean isAttributeDisplayOnly() {
        return attributeDisplayOnly;
    }

    public void setAttributeDisplayOnly(boolean attributeDisplayOnly) {
        this.attributeDisplayOnly = attributeDisplayOnly;
    }

}
