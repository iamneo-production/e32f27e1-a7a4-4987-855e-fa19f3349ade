package com.examly.springapp.models;

import javax.persistence.*;
@Entity
@Table(name="admins")
public class AdminModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String email;
    private String password;
    private String mobileNumber;
    private String userRole;
    public AdminModel() {
    }
    public AdminModel(Long id, String email, String password, String mobileNumber, String userRole) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.mobileNumber = mobileNumber;
        this.userRole = userRole;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getMobileNumber() {
        return mobileNumber;
    }
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    public String getUserRole() {
        return userRole;
    }
    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    
    
}
