package com.eventscheduler.application.service;

import com.eventscheduler.domain.model.Booking;
import com.eventscheduler.domain.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService implements BaseService<Booking> {

    @Autowired
    private BookingRepository repository;

    @Override
    public Booking create(Booking entity) {
        return repository.save(entity);
    }

    @Override
    public Booking read(Long id) {
        return repository.getReferenceById(id);
    }

    @Override
    public Booking update(Long id, Booking entity) {
        return repository.save(entity);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<Booking> list() {
        return repository.findAll();
    }
}
