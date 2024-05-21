package com.eventscheduler.infrastructure.web.controller;

import com.eventscheduler.application.service.RoomService;
import com.eventscheduler.domain.model.Room;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/room")
public class RoomController extends BaseController<Room>{
    public RoomController(RoomService service) {
        super(service);
    }
}
