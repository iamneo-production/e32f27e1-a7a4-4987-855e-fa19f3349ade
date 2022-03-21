package com.examly.springapp.repo;

import com.examly.springapp.models.EventModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<EventModel,Long> {
}
