package com.eventscheduler.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class QuotationItem {
    private Long id;
    private Quotation quotation;
    private Resource resource;
    private String notes;
    private int quantity;
    private Double discountApplied;
//    private Double totalPrice;
}
