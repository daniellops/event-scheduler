package com.eventscheduler.infrastructure.web.controller;

import com.eventscheduler.application.service.EventService;
import com.eventscheduler.domain.model.Event;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/event")
public class EventController extends BaseController<Event> {

    public EventController(EventService service) {
        super(service);
    }

}
