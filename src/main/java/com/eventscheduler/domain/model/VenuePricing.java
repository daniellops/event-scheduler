package com.eventscheduler.domain.model;

import com.eventscheduler.domain.enums.DayOfWeek;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class VenuePricing {
    private Long id;
    private Venue venue;
    private DayOfWeek dayOfWeek;
    private Double pricePerHour;
}
