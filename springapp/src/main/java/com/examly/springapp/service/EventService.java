package com.babyshowerevent.BabyShowerEvent.service;

import com.babyshowerevent.BabyShowerEvent.model.EventModel;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

public interface EventService  {
    public EventModel saveEvent(EventModel event) throws Exception;

    public EventModel viewEvent(Long id);

    public List<EventModel> viewEvents(Long id);

    public void deleteEvent(Long id);
}
