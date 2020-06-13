package pw.goryachev.dp.solid.interface_segregation.incorrect.service;

import pw.goryachev.dp.solid.interface_segregation.incorrect.entity.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by morgan on 13.06.2020
 */

public class UserPersistenceService implements PersistenceService<User>{

    private static final Map<Long, User> USERS = new HashMap<>();

    @Override
    public void save(User entity) {
        synchronized (USERS) {
            USERS.put(entity.getId(), entity);
        }
    }

    @Override
    public void delete(User entity) {
        synchronized (USERS) {
            USERS.remove(entity.getId());
        }
    }

    @Override
    public User findById(Long id) {
        synchronized (USERS) {
            return USERS.get(id);
        }
    }

    @Override
    public List<User> findByName(String name) {
        synchronized (USERS) {
            return USERS.values().stream().filter(u->u.getName().equalsIgnoreCase(name)).collect(Collectors.toList());
        }
    }
}