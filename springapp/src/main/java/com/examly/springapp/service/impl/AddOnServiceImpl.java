package com.babyshowerevent.BabyShowerEvent.service;

import com.babyshowerevent.BabyShowerEvent.model.AddOnModel;
import com.babyshowerevent.BabyShowerEvent.repository.AddOnRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddOnServiceImpl implements AddOnService {
    @Autowired
    private AddOnRepository addOnRepository;

    @Override
    public AddOnModel saveAddOn(AddOnModel addOn) throws Exception {
        try
        {
            return addOnRepository.save(addOn);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<AddOnModel> getAddOns() {
        try
        {
            return addOnRepository.findAll();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public AddOnModel getAddOn(Long id) {
        try
        {
            Optional<AddOnModel> addOnModelOptional = addOnRepository.findById(id);
            if(addOnModelOptional.isPresent())
                return addOnModelOptional.get();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void deleteAddOn(Long id) {
        try
        {
            addOnRepository.deleteById(id);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
