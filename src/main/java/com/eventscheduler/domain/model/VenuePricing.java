package com.eventscheduler.domain.model;

import com.eventscheduler.domain.enums.DayOfWeek;
import com.eventscheduler.infrastructure.persistence.converter.DayOfWeekConverter;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@Entity
@Table(name = "venue_pricing")
public class VenuePricing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "venue_id")
    private Venue venue;

    @Column(name = "day_of_week")
    @Convert(converter = DayOfWeekConverter.class)
    private DayOfWeek dayOfWeek;

    @Column(name = "price_per_hour")
    private Double pricePerHour;
}
