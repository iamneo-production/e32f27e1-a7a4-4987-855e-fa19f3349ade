package com.examly.springapp.controller;

import com.examly.springapp.models.EventModel;
import com.examly.springapp.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/event")
@CrossOrigin("*")
public class EventController {
  @Autowired
    private EventService eventService;

    @PostMapping("/save")
    public EventModel bookEvent(@RequestBody EventModel event)throws Exception
    {
        return this.eventService.saveEvent(event);
    }

    @PutMapping("/update")
    public EventModel updateEvent(@RequestBody EventModel event)throws Exception
    {
        return this.eventService.saveEvent(event);
    }

    @GetMapping("/get/{id}")
    public EventModel viewEvent(@PathVariable("id") Long id)
    {
        return this.eventService.viewEvent(id);
    }

   @GetMapping("/getAll")
    public List<EventModel> viewEvents(Long id)
   {
        return this.eventService.viewEvents(id);
   }

    @DeleteMapping("/delete/{id}")
    public void deleteEvent(@PathVariable("id") Long id)

    {
        this.eventService.deleteEvent(id);
    }

}
