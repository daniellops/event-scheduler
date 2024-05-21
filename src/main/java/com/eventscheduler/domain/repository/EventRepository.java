package com.eventscheduler.domain.repository;

import com.eventscheduler.domain.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {

}
