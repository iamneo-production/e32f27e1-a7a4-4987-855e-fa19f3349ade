package com.examly.springapp.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="menu")
public class FoodModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String foodMenuType;
    private String foodMenuItems;
    private Long foodMenuCost;
    private String foodImageUrl;

    public FoodModel() {
    }

    public FoodModel(Long id, String foodMenuType, String foodMenuItems, Long foodMenuCost,String foodImageUrl) {
        this.id = id;
        this.foodMenuType = foodMenuType;
        this.foodMenuItems = foodMenuItems;
        this.foodMenuCost = foodMenuCost;
        this.foodImageUrl = foodImageUrl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFoodMenuType() {
        return foodMenuType;
    }

    public void setFoodMenuType(String foodMenuType) {
        this.foodMenuType = foodMenuType;
    }

    public String getFoodMenuItems() {
        return foodMenuItems;
    }

    public void setFoodMenuItems(String foodMenuItems) {
        this.foodMenuItems = foodMenuItems;
    }

    public Long getFoodMenuCost() {
        return foodMenuCost;
    }

    public void setFoodMenuCost(Long foodMenuCost) {
        this.foodMenuCost = foodMenuCost;
    }

    public String getFoodImageUrl() {
        return foodImageUrl;
    }

    public void setFoodImageUrl(String foodImageUrl) {
        this.foodImageUrl = foodImageUrl;
    }
}

