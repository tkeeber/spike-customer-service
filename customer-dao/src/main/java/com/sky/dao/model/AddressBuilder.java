package com.sky.dao.model;


public class AddressBuilder {

    private String propertyId;

    private AddressBuilder() {}

    public static AddressBuilder anAddress() {
        return new AddressBuilder();
    }

    public AddressBuilder withPropertyId(String propertyId) {
        this.propertyId = propertyId;
        return this;
    }

    public Address build() {
        return new Address(propertyId);
    }
}
