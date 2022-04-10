package com.examly.springapp.service;

import com.examly.springapp.models.AddOnModel;

import java.util.List;

public interface AddOnService {
    public AddOnModel saveAddOn(AddOnModel addOn) throws Exception;

    public List<AddOnModel> getAddOns();

    public AddOnModel getAddOn(Long id);

    public void deleteAddOn(Long id);
}
