package com.examly.springapp.service;
import com.examly.springapp.models.AdminModel;
public interface AdminService {
    public AdminModel addAdmin(AdminModel admin)throws Exception;
    public AdminModel getAdmin(String email);
    public void deleteAdmin(String email);
}
