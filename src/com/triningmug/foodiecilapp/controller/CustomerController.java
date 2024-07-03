package com.triningmug.foodiecilapp.controller;

import com.triningmug.foodiecilapp.service.CustomerServiceImpl;

public class CustomerController {
    private CustomerServiceImpl customerService;

    public CustomerController(CustomerServiceImpl customerService) {
        this.customerService = customerService;
    }
     public Customer save(Customer customer){
        return this.customerService.save(customer);
     }
}
