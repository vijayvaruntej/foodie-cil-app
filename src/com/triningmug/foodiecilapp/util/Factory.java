package com.triningmug.foodiecilapp.util;

import com.triningmug.foodiecilapp.controller.CustomerController;
import com.triningmug.foodiecilapp.repository.CustomerRepository;
import com.triningmug.foodiecilapp.service.CustomerServiceImpl;

public class Factory {
    public static CsvReader getCsvReader(){ return  new CsvReader();}

    public static CustomerRepository getCustomerRepository(){ return new CustomerRepository();}

    public static CustomerServiceImpl getCustomerService(){ return new CustomerServiceImpl(getCustomerRepository());}

    public static CustomerController getCustomerController(){ return new CustomerController(getCustomerService());}
}
