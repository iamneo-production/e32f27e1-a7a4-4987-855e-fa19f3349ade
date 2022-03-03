package com.examly.springapp.service.impl;

import com.examly.springapp.service.AdminService;
import com.examly.springapp.repo.AdminRepository;
import com.examly.springapp.models.AdminModel;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Optional;

@Service
public class AdminServiceImpl implements AdminService{
    
    @Autowired
    private AdminRepository adminRepository;

    @Override
    public AdminModel addAdmin(AdminModel admin) throws Exception {
        Optional<AdminModel> local=this.adminRepository.findByEmail(admin.getEmail());
        if(local.isPresent()){
            System.out.println("Admin is already there");
            throw new Exception("Admin already Present");
        }
        return this.adminRepository.save(admin);
    }

    @Override
    public AdminModel getAdmin(String email) {
        Optional<AdminModel> local=this.adminRepository.findByEmail(email);
        if(local.isPresent()){
            return local.get();
        }
        return null;
    }

    @Override
    public void deleteAdmin(String email) {
        
        this.adminRepository.deleteByEmail(email);
        
    }
    
}
