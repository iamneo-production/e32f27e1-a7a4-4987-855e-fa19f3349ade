package com.examly.springapp.service.impl;

import com.examly.springapp.service.AdminService;
import com.examly.springapp.repo.AdminRepository;
import com.examly.springapp.models.AdminModel;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class AdminServiceImpl implements AdminService{
    
    @Autowired
    private AdminRepository adminRepository;

    @Override
    public AdminModel addAdmin(AdminModel admin) throws Exception {
        AdminModel local=this.adminRepository.findByEmail(admin.getEmail());
        if(local!=null){
            System.out.println("Admin is already there");
            throw new Exception("Admin already Present");
        }else{
            local=this.adminRepository.save(admin);
        }
        return local;
    }

    @Override
    public AdminModel getAdmin(String email) {
        
        return this.adminRepository.findByEmail(email);
    }

    @Override
    public void deleteAdmin(String email) {
        
        this.adminRepository.deleteByEmail(email);
        
    }
    
}
