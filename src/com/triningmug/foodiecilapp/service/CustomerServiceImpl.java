package com.triningmug.foodiecilapp.service;

import com.triningmug.foodiecilapp.exceptions.CustomerExitsException;
import com.triningmug.foodiecilapp.model.Customer;
import com.triningmug.foodiecilapp.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService{

    private CustomerRepository customerRepository;

    public void CustomerRepository(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }


    @Override
    public Customer save(Customer customer) throws CustomerExitsException {
        //if customer already exits(id, name, email) then throw CustomerExitsException
        //esle save the customer in the repository
        Optional<Customer> customerById = this.customerRepository.findCustomerById(customer.getCustomerId());
        if(customerById.isPresent())
            throw new CustomerExitsException("Customer already exits with this id:" + customer.getCustomerId());
        return this.customerRepository.save(customer);
    }
}
