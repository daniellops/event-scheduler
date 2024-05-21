package com.eventscheduler.application.service;

import com.eventscheduler.domain.model.Venue;
import com.eventscheduler.domain.repository.VenueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VenueService implements BaseService<Venue>{

    @Autowired
    private VenueRepository repository;

    @Override
    public Venue create(Venue entity) {
        return repository.save(entity);
    }

    @Override
    public Venue read(Long id) {
        return repository.getReferenceById(id);
    }

    @Override
    public Venue update(Long id, Venue entity) {
        return repository.save(entity);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<Venue> list() {
        return repository.findAll();
    }
}
