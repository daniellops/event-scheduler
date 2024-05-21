package com.eventscheduler.domain.repository;

import com.eventscheduler.domain.model.Resource;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResourceRepository extends JpaRepository<Resource, Long> {
}
