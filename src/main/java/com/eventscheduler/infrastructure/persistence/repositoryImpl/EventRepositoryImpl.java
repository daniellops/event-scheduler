package com.eventscheduler.infrastructure.persistence.repositoryImpl;

import com.eventscheduler.domain.model.Event;
import com.eventscheduler.domain.repository.EventRepository;
import org.springframework.stereotype.Repository;

@Repository
public class EventRepositoryImpl implements EventRepository {
    // Incluir a integração com o framework de persistência (e.g., JPA, Hibernate)

    @Override
    public Event save(Event event) {
        // Salvar evento no banco de dados
        return event;
    }
}
