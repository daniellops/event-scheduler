package com.eventscheduler.domain.repository;

import com.eventscheduler.domain.model.Event;

public interface EventRepository {
    Event save(Event event);
}
