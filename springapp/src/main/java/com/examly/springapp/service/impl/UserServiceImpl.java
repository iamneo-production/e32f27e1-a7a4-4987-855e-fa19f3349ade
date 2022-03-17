package com.examly.springapp.service.impl;
import java.util.List;
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
    UserServiceImpl(UserRepository userRepo){
        this.userRepository=userRepo;
    }
    @Override
    public UserModel addUser(UserModel user){
        return this.userRepository.save(user);
    }

    @Override
    public UserModel getUserByEmail(String email) {
        Optional<UserModel> local=this.userRepository.findByEmail(email);
        if(local.isPresent()){
            return local.get();
        }
        return null;
    }
    public List<?> getAllUsers(){
        List users = this.userRepository.findAll();
        
        System.out.println(users);

        return users;
    }
    @Override
    public void deleteUser(String email) {
        this.userRepository.deleteByEmail(email);
    }
}
