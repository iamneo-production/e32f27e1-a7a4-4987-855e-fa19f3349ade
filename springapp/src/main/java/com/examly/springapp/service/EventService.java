package com.examly.springapp.service;

import com.examly.springapp.models.EventModel;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

public interface EventService  {
    public EventModel saveEvent(EventModel event) throws Exception;

    public EventModel viewEvent(Long id);

    public List<EventModel> viewEvents(Long id);

    public void deleteEvent(Long id);
}
