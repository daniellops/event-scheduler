package com.eventscheduler.application.service;

import com.eventscheduler.domain.model.Resource;
import com.eventscheduler.domain.repository.ResourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResourceService implements BaseService<Resource> {

    @Autowired
    private ResourceRepository repository;

    @Override
    public Resource create(Resource entity) {
        return repository.save(entity);
    }

    @Override
    public Resource read(Long id) {
        return repository.getReferenceById(id);
    }

    @Override
    public Resource update(Long id, Resource entity) {
        return repository.save(entity);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<Resource> list() {
        return repository.findAll();
    }
}
