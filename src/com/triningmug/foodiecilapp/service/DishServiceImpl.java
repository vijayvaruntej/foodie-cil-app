package com.triningmug.foodiecilapp.service;

import com.triningmug.foodiecilapp.exceptions.CustomerExitsException;
import com.triningmug.foodiecilapp.exceptions.DishExistsException;
import com.triningmug.foodiecilapp.exceptions.DishNotFoundException;
import com.triningmug.foodiecilapp.model.Customer;
import com.triningmug.foodiecilapp.model.Dish;
import com.triningmug.foodiecilapp.repository.DishRepository;

import java.util.List;
import java.util.Optional;

public class DishServiceImpl implements DishService{

    private DishRepository dishRepository;

    public DishServiceImpl(DishRepository dishRepository) {
        this.dishRepository = dishRepository;
    }

    @Override
    public List<Dish> getDishesList() {
        return this.dishRepository.getDishList();
    }

    @Override
    public Dish save(Dish dish) throws DishExistsException {
        Optional<Dish> dishById = this.dishRepository.getDishById(dish.getDishId());
        if(dishById.isPresent())
            throw new DishExitsException("C already exits with this id:" + dish.getDishId());
        return this.dishRepository.save(dish);
    }

    @Override
    public Dish getDishById(String id) throws DishNotFoundException {
        Optional<Dish> dishById = this.dishRepository.getDishById(id);
        if(!dishById.isPresent())
            throw new DishNotFoundException("Dish not found wiht id:" + id);
        return dishById.get();
    }
}
