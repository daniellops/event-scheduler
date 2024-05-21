package com.eventscheduler.domain.repository;

import com.eventscheduler.domain.model.Venue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VenueRepository extends JpaRepository<Venue, Long> {
}
