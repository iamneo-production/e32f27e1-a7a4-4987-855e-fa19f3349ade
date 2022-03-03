package com.examly.springapp.repo;
import com.examly.springapp.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository<UserModel,Long>{
    public Optional<UserModel> findByEmail(String email);
    public void deleteByEmail(String email);
}
