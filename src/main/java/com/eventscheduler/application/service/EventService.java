package com.eventscheduler.application.service;

import com.eventscheduler.application.dto.EventDTO;
import com.eventscheduler.application.mapper.EventMapper;
import com.eventscheduler.domain.model.Event;
import com.eventscheduler.domain.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService implements BaseService<Event> {
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

    @Override
    public Event create(Event entity) {
        return repository.save(entity);
    }

    @Override
    public Event read(Long id) {
        return repository.getReferenceById(id);
    }

    @Override
    public Event update(Long id, Event entity) {
        return repository.save(entity);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<Event> list() {
        return repository.findAll();
    }
}
