package com.examly.springapp.controller;
import com.examly.springapp.models.AdminModel;
import com.examly.springapp.service.AdminService;

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
@RequestMapping("/admin")
@CrossOrigin("*")
public class AuthController {
    @Autowired
    private AdminService adminService;

    @PostMapping("/signup")
    public AdminModel saveAdmin(@RequestBody AdminModel admin)throws Exception{
        return this.adminService.addAdmin(admin);
    }
}
