package com.triningmug.foodiecilapp.util;

import com.triningmug.foodiecilapp.model.Customer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvReader {
    //csv files read and create list of objects
    public List<Customer> readCustomersFromCsv(){
        String customersCsvFilePath="D:\\Git\\java-workspace\\foodie-cil-app\\Data\\customers.csv";
        String line;
        List<Customer> customerList = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(customersCsvFilePath))){
            br.readLine();
            String csvSplitBy = ",";
            while((line=br.readLine()) != null){
                //c001,john doe, john.deo@gmail.com, johndoe@1234
                String[] data = line.split(csvSplitBy);
                Customer customer = new Customer();
                customer.setId(data[0])
                //customer.setName(data[1]); //builder design pattern
                        .setName(data[1])
                        .setEmail(data[2])
                        .setPassword(data[3]);
                customerList.add(customer);
            }
        }catch(IOException e){
            System.out.println("File not found");
            System.exit(0);
            e.printStackTrace();
        }
        return customerList;
    }
}
