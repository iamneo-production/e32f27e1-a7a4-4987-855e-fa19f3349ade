package com.examly.springapp.controller;
import com.examly.springapp.models.UserModel;
import com.examly.springapp.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/signup")
    public UserModel addUser(@RequestBody UserModel data)throws Exception{
        return this.userService.addUser(data);
    }

    @GetMapping("/{email}")
    public UserModel getUser(@PathVariable("email") String UserID){
        return this.userService.getUser(UserID);
    }
    
    @DeleteMapping("/{email}")
    public void deleteUser(@PathVariable("email") String UserID){
        this.userService.deleteUser(UserID);
    }
}
