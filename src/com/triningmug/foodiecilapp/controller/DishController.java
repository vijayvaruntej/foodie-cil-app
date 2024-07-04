package com.triningmug.foodiecilapp.controller;

import com.triningmug.foodiecilapp.model.Dish;
import com.triningmug.foodiecilapp.service.DishServiceImpl;

import java.util.List;

public class DishController {

    private DishServiceImpl dishService;

    public DishController(DishServiceImpl dishService) {
        this.dishService = dishService;
    }

    public List<Dish> getDishesList(){ return this.dishService.getDishesList();}


}
