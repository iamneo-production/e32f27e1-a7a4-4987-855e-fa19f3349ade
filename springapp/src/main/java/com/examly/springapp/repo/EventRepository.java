package com.babyshowerevent.BabyShowerEvent.repository;

import com.babyshowerevent.BabyShowerEvent.model.EventModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<EventModel,Long> {
}
