package com.examly.springapp.models;

import javax.persistence.*;

@Entity
@Table(name="addOn")
public class AddOnModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String description;
    private String addOnPrice;
    private String imageUrl;

    public AddOnModel(Long id, String name, String description, String addOnPrice, String imageUrl) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.addOnPrice = addOnPrice;
        this.imageUrl = imageUrl;
    }
    public AddOnModel()
    {

    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getAddOnPrice()
    {
        return addOnPrice;
    }

    public void setAddOnPrice(String addOnPrice)
    {
        this.addOnPrice = addOnPrice;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }


}
