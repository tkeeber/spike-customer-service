package com.sky.services;

import com.sky.dao.CustomerDao;
import com.sky.dao.model.Address;

public class CustomerService {

    private CustomerDao customerDao;

    public CustomerService(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    public Address getActiveCustomerAddress(String partyId) {
        return customerDao.getCustomerAddress(partyId);
    }
}
