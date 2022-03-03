package com.examly.springapp.repo;
import com.examly.springapp.models.AdminModel;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface AdminRepository extends JpaRepository<AdminModel,Long>{
    public Optional<AdminModel> findByEmail(String email);
    public void deleteByEmail(String email);
}
