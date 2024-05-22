package com.eventscheduler.infrastructure.web.controller;

import com.eventscheduler.application.service.BaseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public abstract class BaseController<T> {

    private final BaseService<T> service;

    public BaseController(BaseService<T> service) {
        this.service = service;
    }

    @PostMapping
    public T create(@RequestBody T entity) {
        return service.create(entity);
    }

    @GetMapping("/{id}")
    public T read(@PathVariable Long id) {
        return service.read(id);
    }

    @PutMapping("/{id}")
    public T update(@PathVariable Long id, @RequestBody T entity) {
        return service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @GetMapping("/items")
    public List<T> list() {
        return service.list();
    }
}