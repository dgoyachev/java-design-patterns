package pw.goryachev.dp.solid.interface_segregation.correct.service;

import pw.goryachev.dp.solid.interface_segregation.correct.entity.Order;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by morgan on 13.06.2020
 */

public class OrderPersistenceService implements PersistenceService<Order>{

    private static final Map<Long, Order> ORDERS = new HashMap<>();

    @Override
    public void save(Order entity) {
        synchronized (ORDERS) {
            ORDERS.put(entity.getId(), entity);
        }
    }

    @Override
    public void delete(Order entity) {
        synchronized (ORDERS) {
            ORDERS.remove(entity.getId());
        }
    }

    @Override
    public Order findById(Long id) {
        synchronized (ORDERS) {
            return ORDERS.get(id);
        }
    }
}