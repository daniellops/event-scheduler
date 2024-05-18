package com.eventscheduler.application.service;

import com.eventscheduler.application.dto.EventDTO;
import com.eventscheduler.application.mapper.EventMapper;
import com.eventscheduler.domain.model.Event;
import com.eventscheduler.domain.repository.EventRepository;

public class EventService {
    private EventRepository repository;
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
