package com.eventscheduler.application.service;

import com.eventscheduler.domain.model.User;
import com.eventscheduler.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements BaseService<User> {

    @Autowired
    private UserRepository repository;

    @Override
    public User create(User entity) {
        return repository.save(entity);
    }

    @Override
    public User read(Long id) {
        return repository.getReferenceById(id);
    }

    @Override
    public User update(Long id, User entity) {
        return repository.save(entity);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<User> list() {
        return repository.findAll();
    }
}
