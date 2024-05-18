package com.eventscheduler.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Room {
    private Long id;
    private String name;
    private int capacity;
    private List<Resource> fixedResources;
    private List<Resource> rentableResources;
}
