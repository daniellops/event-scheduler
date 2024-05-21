package com.eventscheduler.application.service;

import com.eventscheduler.domain.model.Quotation;
import com.eventscheduler.domain.repository.QuotationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuotationService implements BaseService<Quotation> {

    @Autowired
    private QuotationRepository repository;

    @Override
    public Quotation create(Quotation entity) {
        return repository.save(entity);
    }

    @Override
    public Quotation read(Long id) {
        return repository.getReferenceById(id);
    }

    @Override
    public Quotation update(Long id, Quotation entity) {
        return repository.save(entity);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<Quotation> list() {
        return repository.findAll();
    }
}
