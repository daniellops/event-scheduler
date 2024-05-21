package com.eventscheduler.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@Entity
@Table(name = "venue")
public class Venue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "address")
    private String address;

    @OneToMany(mappedBy = "venue", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Room> rooms;

    @OneToMany(mappedBy = "venue", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<VenuePricing> pricingList;
}
