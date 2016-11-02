package com.sky.services;

import com.sky.services.support.Support;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;


@RunWith(MockitoJUnitRunner.class)
public class CustomerControllerTest {

    @Mock
    private CustomerService mockCustomerService;

    @Mock
    private Support mockSupport;

    private final String expectedPartyId = "anExpectedpartyId";
    private CustomerController customerController;

    @Before
    public void before() {
        customerController = new CustomerController(mockSupport, mockCustomerService);
    }

    @Test
    public void verifyGetCustomerAddressCallsService() throws Exception {

        customerController.activeCustomerAddress(expectedPartyId);
        verify(mockCustomerService).getActiveCustomerAddress(expectedPartyId);
    }

    @Test
    public void verifyGetCustomerAddressCallsSupport() {
        customerController.activeCustomerAddress(expectedPartyId);
        verify(mockSupport).onEntry(expectedPartyId);
    }

}