package com.examly.springapp.service;
import com.examly.springapp.models.UserModel;
import java.util.List;

public interface UserService {
    public UserModel addUser(UserModel user);
    public UserModel getUserByEmail(String email);
    public void deleteUser(String email);
    public List<?> getAllUsers();
}
