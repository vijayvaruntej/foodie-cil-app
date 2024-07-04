package com.triningmug.foodiecilapp.util;

import com.triningmug.foodiecilapp.model.Customer;
import com.triningmug.foodiecilapp.model.Dish;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DishesFromCsv {
    //csv files read and create list of objects
    public List<Dish> readDishesFromCsv(){
        String DishCsvFilePath="D:\\Git\\java-workspace\\foodie-cil-app\\Data\\dishes.csv";
        String line;
        List<Dish> dishesList = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(DishCsvFilePath))) {
            br.readLine();
            String csvSplitBy = ",";
            while ((line = br.readLine()) != null) {
                //c001,john doe, john.deo@gmail.com, johndoe@1234
                String[] data = line.split(csvSplitBy);

                Dish dish = new Dish();
                dish.setId(data[0])
                        .setName(data[1])
                        .setDescription(data[2])
                        .setPrice(Double.parseDouble(data[3]));
                dishesList.add(dish);
            }
        }catch(IOException e){
            System.out.println("File not found");
            System.exit(0);
            e.printStackTrace();
        }
        return dishesList;
    }
}
