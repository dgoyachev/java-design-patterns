package pw.goryachev.dp.solid.interface_segregation.correct.service;

import pw.goryachev.dp.solid.interface_segregation.correct.entity.Entity;

public interface PersistenceService<T extends Entity> {

    void save(T entity);

    void delete(T entity);

    T findById(Long id);
}