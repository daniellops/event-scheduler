package com.eventscheduler.infrastructure.web.controller;

import com.eventscheduler.application.service.ResourceService;
import com.eventscheduler.domain.model.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/resource")
public class ResourceController  extends BaseController<Resource>{
    public ResourceController(ResourceService service) {
        super(service);
    }
}
