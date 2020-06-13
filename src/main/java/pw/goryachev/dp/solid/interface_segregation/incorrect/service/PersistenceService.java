package pw.goryachev.dp.solid.interface_segregation.incorrect.service;

import pw.goryachev.dp.solid.interface_segregation.incorrect.entity.Entity;

import java.util.List;

public interface PersistenceService<T extends Entity> {

    void save(T entity);

    void delete(T entity);

    T findById(Long id);

    List<T> findByName(String name);
}