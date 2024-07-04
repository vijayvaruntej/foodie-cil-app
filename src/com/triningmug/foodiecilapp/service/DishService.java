package com.triningmug.foodiecilapp.service;

import com.triningmug.foodiecilapp.exceptions.DishExistsException;
import com.triningmug.foodiecilapp.exceptions.DishNotFoundException;
import com.triningmug.foodiecilapp.model.Dish;

import java.util.List;

public interface DishService {

    public List<Dish> getDishesList();

    public Dish save(Dish dish) throws DishExistsException;

    public Dish getDishById(String id) throws DishNotFoundException;
}
