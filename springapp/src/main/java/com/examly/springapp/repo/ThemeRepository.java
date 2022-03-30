package com.examly.springapp.repo;

import com.examly.springapp.models.ThemeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ThemeRepository extends JpaRepository<ThemeModel,Long> {

}

