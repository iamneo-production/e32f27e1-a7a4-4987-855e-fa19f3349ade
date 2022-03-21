package com.examly.springapp.repo;

import com.examly.springapp.models.AddOnModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddOnRepository extends JpaRepository<AddOnModel,Long> {
}
