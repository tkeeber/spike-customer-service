package com.sky.services;

import com.sky.dao.CustomerDao;
import com.sky.dao.model.Address;
import org.hamcrest.core.Is;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static com.sky.dao.model.AddressTestData.anAddress;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class CustomerServiceTest {

    @Mock
    private CustomerDao mockCustomerDao;

    private final String expectedPartyId =  "aPartyId";

    private CustomerService customerService = new CustomerService(mockCustomerDao);

    @Test
    public void verifyGetActiveCustomerAddress() throws Exception {
        customerService.getActiveCustomerAddress(expectedPartyId);
        verify(mockCustomerDao).getCustomerAddress(expectedPartyId);
    }

    @Test
    public void getActiveCustomerAddressReturns() {
        final Address expectedAddress = anAddress().build();
        Mockito.when(mockCustomerDao.getCustomerAddress(expectedPartyId)).thenReturn(expectedAddress);
        Address address = customerService.getActiveCustomerAddress(expectedPartyId);
        assertSame(address, Is.is(expectedAddress));
    }

}