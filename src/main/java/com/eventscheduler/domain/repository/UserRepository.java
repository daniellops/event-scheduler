package com.eventscheduler.domain.repository;

import com.eventscheduler.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
