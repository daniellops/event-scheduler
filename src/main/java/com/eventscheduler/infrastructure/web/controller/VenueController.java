package com.eventscheduler.infrastructure.web.controller;

import com.eventscheduler.application.service.VenueService;
import com.eventscheduler.domain.model.Venue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/venue")
public class VenueController extends BaseController<Venue> {
    public VenueController(VenueService service) {
        super(service);
    }
}
