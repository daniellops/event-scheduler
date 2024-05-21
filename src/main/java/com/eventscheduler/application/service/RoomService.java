package com.eventscheduler.application.service;

import com.eventscheduler.domain.model.Room;
import com.eventscheduler.domain.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService implements BaseService<Room> {

    @Autowired
    private RoomRepository repository;

    @Override
    public Room create(Room entity) {
        return repository.save(entity);
    }

    @Override
    public Room read(Long id) {
        return repository.getReferenceById(id);
    }

    @Override
    public Room update(Long id, Room entity) {
        return repository.save(entity);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<Room> list() {
        return repository.findAll();
    }
}
