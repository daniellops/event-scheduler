package com.eventscheduler.infrastructure.web.controller;

import com.eventscheduler.application.service.BookingService;
import com.eventscheduler.domain.model.Booking;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/booking")
public class BookingController extends BaseController<Booking>{
    public BookingController(BookingService service) {
        super(service);
    }

}
