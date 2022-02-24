package com.examly.springapp.repo;
import com.examly.springapp.models.AdminModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<AdminModel,Long>{
    public AdminModel findByEmail(String email);
    public void deleteByEmail(String email);
}
