package com.eventscheduler.domain.repository;

import com.eventscheduler.domain.model.Quotation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuotationRepository extends JpaRepository<Quotation, Long> {
}
