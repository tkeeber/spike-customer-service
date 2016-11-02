package com.sky.dao;


import com.sky.dao.model.Address;

import static com.sky.dao.model.AddressBuilder.anAddress;

public class CustomerDao {

    private static final String A_HARDCODED_PROPERTY_ID = "Crazy bad Snazzzle";

    public Address getCustomerAddress(String partyId) {
        return anAddress().withPropertyId(A_HARDCODED_PROPERTY_ID).build();
    }
}
