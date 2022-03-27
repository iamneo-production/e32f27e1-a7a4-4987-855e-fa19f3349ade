package com.examly.springapp.service.impl;

import com.examly.springapp.service.UserService;
import com.examly.springapp.repo.UserRepository;
import com.examly.springapp.models.UserModel;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{
    
    @Autowired
    private UserRepository userRepository;
    @Override
    public UserModel addUser(UserModel user) throws Exception {
        Optional<UserModel> local=this.userRepository.findByEmail(user.getEmail());
        if(local.isPresent()){
            System.out.print("User is ALready There!");
            throw new Exception("User already Present");
        }
        return this.userRepository.save(user);
    }

    @Override
    public UserModel getUser(String email) {
        Optional<UserModel> local=this.userRepository.findByEmail(email);
        if(local.isPresent()){
            return local.get();
        }
        return null;
    }

    @Override
    public void deleteUser(String email) {
        this.userRepository.deleteByEmail(email);
    }
}
