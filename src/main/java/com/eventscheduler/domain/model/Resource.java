package com.eventscheduler.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Resource {
    private Long id;
    private String name;
    private String description;
    private boolean isRentable;
    private Double pricePerDay;
    private int quantityAvailable;
    private Room room;
}
