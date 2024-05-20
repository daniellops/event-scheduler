package com.eventscheduler.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Venue {
    private Long id;
    private String name;
    private String description;
    private String address;
    private List<Room> rooms;
    private List<VenuePricing> pricingList;
}
