package com.eventscheduler.domain.service;

import com.eventscheduler.domain.model.Event;
import com.eventscheduler.domain.repository.EventRepository;

public class EventDomainService {
    private EventRepository repository;

    public EventDomainService(EventRepository repository) {
        this.repository = repository;
    }

    public void scheduleEvent(Event event) {
        // Lógica para agendar o evento, incluindo verificações e preparações necessárias
        repository.save(event);
    }
}
