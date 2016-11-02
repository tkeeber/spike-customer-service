package com.sky.dao.model;


public final class Address {
    private final String propertyId;

    Address(final String propertyId) {
        this.propertyId = propertyId;
    }

    public String getPropertyId() {
        return this.propertyId;
    }
}
