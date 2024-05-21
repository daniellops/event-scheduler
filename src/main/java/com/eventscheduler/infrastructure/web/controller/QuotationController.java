package com.eventscheduler.infrastructure.web.controller;

import com.eventscheduler.application.service.QuotationService;
import com.eventscheduler.domain.model.Quotation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quotation")
public class QuotationController extends BaseController<Quotation> {
    public QuotationController(QuotationService service) {
        super(service);
    }

}
