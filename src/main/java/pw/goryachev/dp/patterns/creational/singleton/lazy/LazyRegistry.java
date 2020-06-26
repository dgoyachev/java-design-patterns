package pw.goryachev.dp.patterns.creational.singleton.lazy;

/**
 * Created by morgan on 26.06.2020
 */

public class LazyRegistry {

    private LazyRegistry() {

    }

    private static volatile LazyRegistry INSTANCE;

    public static LazyRegistry getInstance() {
        if(INSTANCE == null) {
            synchronized (LazyRegistry.class) {
                if(INSTANCE == null) {
                    INSTANCE = new LazyRegistry();
                }
            }
        }
        return INSTANCE;
    }
}
