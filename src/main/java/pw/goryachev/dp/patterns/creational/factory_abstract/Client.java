package pw.goryachev.dp.patterns.creational.factory_abstract;

/**
 * Created by morgan on 26.06.2020
 */

public class Client {

    private final ResourceFactory factory;

    public Client(ResourceFactory factory) {
        this.factory = factory;
    }

    public Instance createServer(Instance.Capacity cap, int storageMib) {
        Instance instance = factory.createInstance(cap);
        Storage storage = factory.createStorage(storageMib);
        instance.attachStorage(storage);
        return instance;
    }
}
