package com.examly.springapp.repo;

import com.examly.springapp.models.FoodModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodRepository extends JpaRepository<FoodModel,Long> {
  
}
