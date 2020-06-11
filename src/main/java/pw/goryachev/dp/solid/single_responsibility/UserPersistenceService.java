package pw.goryachev.dp.solid.single_responsibility;

/**
 * Created by morgan on 11.06.2020
 */

public class UserPersistenceService {
    private Store store = new Store();

    public void saveUser(User user) {
        store.store(user);
    }
}
