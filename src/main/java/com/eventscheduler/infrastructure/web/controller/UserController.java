package com.eventscheduler.infrastructure.web.controller;

import com.eventscheduler.application.service.UserService;
import com.eventscheduler.domain.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController extends BaseController<User>{
    public UserController(UserService service) {
        super(service);
    }
}
