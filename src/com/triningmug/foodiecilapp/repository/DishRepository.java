package com.triningmug.foodiecilapp.repository;

import com.triningmug.foodiecilapp.model.Customer;
import com.triningmug.foodiecilapp.model.Dish;
import com.triningmug.foodiecilapp.util.CsvReader;
import com.triningmug.foodiecilapp.util.DishesFromCsv;
import com.triningmug.foodiecilapp.util.Factory;

import java.util.List;
import java.util.Optional;

public class DishRepository {

         List<Dish> dishList;

        public DishRepository(){
            this.dishList = Factory.getCsvReader().readDishesFromCsv();
        }

        public List<Dish> getAllDishes(){
            return this.dishList;
        }

        public Dish save(Dish dish){
            this.dishList.add(dish);
            return dish;
        }

        public Optional<Dish> getDishById(String id){
            return this.dishList.stream().filter(dish -> dish.getId().equals(id)).findFirst();
        }

    }