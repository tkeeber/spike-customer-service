package com.sky.services;

import com.sky.services.support.Support;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@EnableAutoConfiguration
public class CustomerController {

    private CustomerService customerService;
    private Support support;

    public CustomerController(Support support, CustomerService customerService) {
        this.support = support;
        this.customerService = customerService;
    }

    @RequestMapping("/customer/address")
    public String activeCustomerAddress(String partyId) {
        support.onEntry(partyId);
        customerService.getActiveCustomerAddress(partyId);
        return "";
    }


}
