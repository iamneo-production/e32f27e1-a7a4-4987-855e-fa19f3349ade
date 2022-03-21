package com.babyshowerevent.BabyShowerEvent.controller;

import com.babyshowerevent.BabyShowerEvent.model.AddOnModel;
import com.babyshowerevent.BabyShowerEvent.service.AddOnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/addOn")
@CrossOrigin("*")
public class AddOnController {
    @Autowired
    private AddOnService addOnService;

    @PostMapping("/save")
    public AddOnModel addAddOn(@RequestBody AddOnModel addOn)throws Exception
    {
        return this.addOnService.saveAddOn(addOn);
    }

    @PutMapping("/update")
    public AddOnModel updateAddOn(@RequestBody AddOnModel addOn)throws Exception
    {
        return this.addOnService.saveAddOn(addOn);
    }
    @GetMapping("/getAll")
    public List<AddOnModel> getAddOn()

    {
        return this.addOnService.getAddOns();
    }
    @GetMapping("/get/{id}")
    public AddOnModel getAddOn(@PathVariable("id") Long id)

    {
        return this.addOnService.getAddOn(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteAddOn(@PathVariable("id") Long id)

    {
        this.addOnService.deleteAddOn(id);
    }
}
