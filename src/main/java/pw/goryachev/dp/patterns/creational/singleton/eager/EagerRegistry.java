package pw.goryachev.dp.patterns.creational.singleton.eager;

/**
 * Created by morgan on 26.06.2020
 */

public class EagerRegistry {

    private EagerRegistry() {
    }

    private static final EagerRegistry INSTANCE = new EagerRegistry();

    public static EagerRegistry getInstance() {
        return INSTANCE;
    }
}