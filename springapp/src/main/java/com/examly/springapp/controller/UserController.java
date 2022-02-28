package com.examly.springapp.controller;
import com.examly.springapp.models.*;
import com.examly.springapp.service.UserService;

import com.examly.springapp.service.impl.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private UserServiceImpl userServiceImpl;

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

    @PostMapping("/login")
    public ResponseEntity<String> checkLogin(@RequestBody LoginModel loginModel) {
        UserModel  user = userServiceImpl.getUser(loginModel.getEmail());
        if(user == null) {
            return new ResponseEntity<String>("User not found", HttpStatus.NOT_FOUND);
        }
        else if( user != null && user.getPassword().equals(loginModel.getPassword())) {
            return new ResponseEntity<String>("User", HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
    }
}
