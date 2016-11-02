package com.sky.dao.model;

public final class AddressTestData {

    public static AddressBuilder anAddress() {
        return AddressBuilder.anAddress().withPropertyId("partyId");
    }


    private AddressTestData() {}
}
