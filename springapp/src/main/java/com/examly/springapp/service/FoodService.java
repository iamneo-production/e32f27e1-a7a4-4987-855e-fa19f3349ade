package com.examly.springapp.service;

import com.examly.springapp.models.FoodModel;
import com.examly.springapp.repo.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoodService {
    private FoodRepository foodRepository;

    @Autowired
    public FoodService(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }


    public FoodModel saveMenu(FoodModel foodModel) {
           return foodRepository.save(foodModel);
    }

    public List<FoodModel> getMenu() {
        List<FoodModel> foodModel = new ArrayList<>();
        foodRepository.findAll().forEach(foodModels -> foodModel.add(foodModels));
        return foodModel;
    }

    public FoodModel fetchMenu(Long id){
        return foodRepository.findById(id).get();
    }

    @Transactional
    public String deleteById(Long id){
         foodRepository.deleteById(id);
         return "Deleted Successfully";
    }

    public FoodModel updateMenuById(Long id, FoodModel foodModel) {
        FoodModel Getmenu=new FoodModel();
        Getmenu=foodRepository.findById(id).get();
        Getmenu.setFoodMenuType(foodModel.getFoodMenuType());
        Getmenu.setFoodMenuItems(foodModel.getFoodMenuItems());
        Getmenu.setFoodMenuCost(foodModel.getFoodMenuCost());
        Getmenu.setFoodImageUrl(foodModel.getFoodImageUrl());
        return foodRepository.save(Getmenu);
    }
}
