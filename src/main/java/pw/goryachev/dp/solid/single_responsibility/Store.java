package pw.goryachev.dp.solid.single_responsibility;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by morgan on 11.06.2020
 */

public class Store {

    private static final Map<String, User> STORAGE = new HashMap<>();

    public void store(User user) {
        synchronized(STORAGE) {
            STORAGE.put(user.getName(), user);
        }
    }

    public User getUser(String name) {
        synchronized(STORAGE) {
            return STORAGE.get(name);
        }
    }
}