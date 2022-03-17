package com.examly.springapp.controller;
import com.examly.springapp.exceptions.UserException;
import com.examly.springapp.models.*;
import com.examly.springapp.service.UserService;
import java.util.List;
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
@CrossOrigin(origins="*")
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/signup")
    public UserModel addUser(@RequestBody UserModel data){
    	UserModel user = userService.getUserByEmail(data.getEmail());
    	if(user!=null) {
    		throw new UserException("User already Present");
    	}
        return this.userService.addUser(data);
    }
    @GetMapping("/all")
    public List<?> getUsers(){
        return this.userService.getAllUsers();
    }
    @GetMapping("/{email}")
    public UserModel getUser(@PathVariable("email") String email){
        return this.userService.getUserByEmail(email);
    }
    
    @DeleteMapping("/{email}")
    public void deleteUser(@PathVariable("email") String email){
        this.userService.deleteUser(email);
    }

    @PostMapping("/login")
    public ResponseEntity<String> checkLogin(@RequestBody LoginModel loginModel) {
        UserModel  user = userService.getUserByEmail(loginModel.getEmail());
        if(user == null) {
            return new ResponseEntity<String>("User not found", HttpStatus.NOT_FOUND);
        }
        else if( user != null && user.getPassword().equals(loginModel.getPassword())) {
            return new ResponseEntity<String>("User", HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
    }
}
