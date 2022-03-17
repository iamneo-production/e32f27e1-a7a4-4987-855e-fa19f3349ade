package com.examly.springapp.controller;
import com.examly.springapp.models.*;
import com.examly.springapp.service.impl.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class AllController {
    
    @Autowired
    private UserServiceImpl userService;
    @Autowired
    private AdminServiceImpl adminService;


    @PostMapping("/login")
    public ResponseEntity<String> checkLogin(@RequestBody LoginModel loginModel) {
        UserModel  user = userService.getUserByEmail(loginModel.getEmail());
        AdminModel admin = adminService.getAdmin(loginModel.getEmail());
        if(user == null && admin == null) {
            return new ResponseEntity<>("User not found", HttpStatus.NOT_FOUND);
        }
        else if( user != null && user.getPassword().equals(loginModel.getPassword())) {
            return new ResponseEntity<>("User", HttpStatus.OK);
        }
        else if( admin != null && admin.getPassword().equals(loginModel.getPassword())) {
            return new ResponseEntity<>("Admin", HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
    }

}
