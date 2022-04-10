package com.examly.springapp.service.impl;

import com.examly.springap.models.EventModel;
import com.examly.springapp.repo.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventServiceImpl implements EventService {
    @Autowired
    private EventRepository eventRepository;

    @Override
    public EventModel saveEvent(EventModel event) throws Exception {
        try
        {
            return eventRepository.save(event);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public EventModel viewEvent(Long id) {
        try{
            Optional<EventModel> eventModelOptional = eventRepository.findById(id);
            if(eventModelOptional.isPresent())
                return eventModelOptional.get();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<EventModel> viewEvents(Long id) {
        try
        {
            return eventRepository.findAll();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void deleteEvent(Long id) {
        try
        {
            eventRepository.deleteById(id);
        }
        catch(Exception e)
        {

            e.printStackTrace();
        }
    }



}
