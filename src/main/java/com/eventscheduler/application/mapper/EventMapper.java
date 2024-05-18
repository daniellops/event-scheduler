package com.eventscheduler.application.mapper;

import com.eventscheduler.application.dto.EventDTO;
import com.eventscheduler.domain.model.Event;
import org.springframework.stereotype.Component;

@Component
public class EventMapper {
    public Event toEntity(EventDTO dto) {
        Event event = new Event();
        // Map fields from DTO to Event
        return event;
    }

    public EventDTO toDto(Event event) {
        EventDTO dto = new EventDTO();
        // Map fields from Event to DTO
        return dto;
    }
}
