package com.eventscheduler.domain.model;

import com.eventscheduler.domain.enums.QuotationStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Quotation {
    private Long id;
    private Event event;
//    private Double totalValue;
    private QuotationStatus status;
    private List<QuotationItem> items;
}
