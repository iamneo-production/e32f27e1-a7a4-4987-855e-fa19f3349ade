package com.examly.springapp.repo;
import com.examly.springapp.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepository extends JpaRepository<UserModel,Long>{
    public UserModel findByEmail(String email);
    public void deleteByEmail(String email);
}
