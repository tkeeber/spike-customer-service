package com.sky.dao;

import com.sky.dao.model.Address;
import com.sky.dao.model.AddressBuilder;
import com.sky.dao.model.AddressTestData;
import org.hamcrest.core.Is;
import org.junit.Test;

import static com.sky.dao.model.AddressTestData.anAddress;
import static org.junit.Assert.*;

public class CustomerDaoTest {

    @Test
    public void testGetCustomerAddressReturnsAddress() {
        final String propertyId = "propertyId";
        final String partyId = "partyID";
        Address expectedAddress = anAddress().build();
        CustomerDao customerDao = new CustomerDao();
        Address actualAddress =customerDao.getCustomerAddress(partyId);
        assertEquals(actualAddress.getPropertyId(), Is.is(expectedAddress.getPropertyId()));
    }
}