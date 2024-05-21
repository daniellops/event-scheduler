package com.eventscheduler.application.service;

import java.util.List;

public interface BaseService<T> {
    T create(T entity);
    T read(Long id);
    T update(Long id, T entity);
    void delete(Long id);
    List<T> list();
}