package com.triningmug.foodiecilapp;

import com.triningmug.foodiecilapp.repository.CustomerRepository;
import com.triningmug.foodiecilapp.util.CsvReader;

public class Main {
    public static void main(String[] args) {
        CsvReader csvReader = new CsvReader();
        System.out.println(csvReader.readCustomersFromCsv());
        CustomerRepository customerRepository = new CustomerRepository();
        System.out.println(customerRepository.getAllCustomers());
    }
}
