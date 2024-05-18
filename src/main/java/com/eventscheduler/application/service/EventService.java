package com.eventscheduler.application.service;

import com.eventscheduler.application.dto.EventDTO;
import com.eventscheduler.application.mapper.EventMapper;
import com.eventscheduler.domain.model.Event;
import com.eventscheduler.domain.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventService {
    @Autowired
    private EventRepository repository;
    @Autowired
    private EventMapper mapper;

    public EventService(EventRepository repository, EventMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public EventDTO createEvent(EventDTO eventDTO) {
        Event event = mapper.toEntity(eventDTO);
        event = repository.save(event);
        return mapper.toDto(event);
    }
}
