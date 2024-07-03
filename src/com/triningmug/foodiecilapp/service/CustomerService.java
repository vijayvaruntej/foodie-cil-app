package com.triningmug.foodiecilapp.service;

import com.triningmug.foodiecilapp.exceptions.CustomerExitsException;
import com.triningmug.foodiecilapp.model.Customer;

public interface CustomerService {

    public Customer save(Customer customer) throws CustomerExitsException;
}
