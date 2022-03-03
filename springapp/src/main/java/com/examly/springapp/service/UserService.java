package com.examly.springapp.service;
import com.examly.springapp.models.UserModel;

public interface UserService {
    public UserModel addUser(UserModel user)throws Exception;
    public UserModel getUser(String email);
    public void deleteUser(String email);
}
