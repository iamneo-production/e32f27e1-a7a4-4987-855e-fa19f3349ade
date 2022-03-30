package com.examly.springapp.controller;

import com.examly.springapp.models.FoodModel;
import com.examly.springapp.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FoodController {
    private FoodService foodService;

    @Autowired
    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }

    @GetMapping("/getAllMenu")
    public List<FoodModel> getAllMenu(){
        return foodService.getMenu();
    }

    @GetMapping("/getMenu/{id}")
    public FoodModel getMenuById(@PathVariable("id") Long id){
        return foodService.fetchMenu(id);
    }

    @PostMapping("/addMenu")
    public FoodModel addMenu(@RequestBody FoodModel foodModel){
        return foodService.saveMenu(foodModel);
    }

    @DeleteMapping("/deleteMenu/{id}")
    public String deleteMenu(@PathVariable("id") Long id){
        return foodService.deleteById(id);
    }

    @PutMapping("/editMenu/{id}")
    public FoodModel updateMenu(@PathVariable("id") Long id,@RequestBody FoodModel foodModel){
        return foodService.updateMenuById(id,foodModel);
    }

}
