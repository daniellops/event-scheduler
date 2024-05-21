package com.eventscheduler.domain.repository;

import com.eventscheduler.domain.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
