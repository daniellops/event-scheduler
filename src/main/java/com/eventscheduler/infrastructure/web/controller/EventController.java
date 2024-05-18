package com.eventscheduler.infrastructure.web.controller;

import com.eventscheduler.application.dto.EventDTO;
import com.eventscheduler.application.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/events")
public class EventController {
    @Autowired
    private final EventService eventService;

    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

//    @PostMapping
//    public ResponseEntity<EventDTO> createEvent(@RequestBody EventDTO eventDTO) {
//        EventDTO createdEvent = eventService.createEvent(eventDTO);
//        return ResponseEntity.ok(createdEvent);
//    }

    @GetMapping
    public ResponseEntity<String> create() {
        return ResponseEntity.ok("deu certo");
    }
}
