package com.eventscheduler.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Booking {
    private Long id;
    private Event event;
    private Room room;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private List<Resource> rentedResources;
}
