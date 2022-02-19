package com.examly.springapp.service.impl;

import com.examly.springapp.service.UserService;
import com.examly.springapp.repo.UserRepository;
import com.examly.springapp.models.UserModel;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class UserServiceImpl implements UserService{
    
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserModel addUser(UserModel user) throws Exception {
        UserModel local=this.userRepository.findByEmail(user.getEmail());
        if(local!=null){
            System.out.println("User is already there");
            throw new Exception("User already Present");
        }else{
            local=this.userRepository.save(user);
        }
        return local;
    }

    @Override
    public UserModel getUser(String email) {
        return this.userRepository.findByEmail(email);
    }

    @Override
    public void deleteUser(String email) {
        this.userRepository.deleteByEmail(email);
    }
}
