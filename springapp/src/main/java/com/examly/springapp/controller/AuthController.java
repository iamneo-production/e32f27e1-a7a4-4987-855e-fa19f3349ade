package com.examly.springapp.controller;
import com.examly.springapp.models.*;
import com.examly.springapp.service.AdminService;

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
@RequestMapping("/admin")
@CrossOrigin("*")
public class AuthController {
    @Autowired
    private AdminService adminService;

    @Autowired
    private AdminServiceImpl adminServiceImpl;

    @PostMapping("/signup")
    public AdminModel saveAdmin(@RequestBody AdminModel admin)throws Exception{
        return this.adminService.addAdmin(admin);
    }

    @PostMapping("/login")
    public ResponseEntity<String> checkLogin(@RequestBody LoginModel loginModel) {
        AdminModel admin = adminServiceImpl.getAdmin(loginModel.getEmail());
        if(admin == null) {
            return new ResponseEntity<String>("Admin not found", HttpStatus.NOT_FOUND);
        }
        else if( admin != null && admin.getPassword().equals(loginModel.getPassword())) {
            return new ResponseEntity<String>("Admin", HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
    }
}
