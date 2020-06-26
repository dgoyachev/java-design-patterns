package pw.goryachev.dp.patterns.creational.factory_abstract.gcp;

import pw.goryachev.dp.patterns.creational.factory_abstract.Instance;
import pw.goryachev.dp.patterns.creational.factory_abstract.ResourceFactory;
import pw.goryachev.dp.patterns.creational.factory_abstract.Storage;

/**
 * Created by morgan on 26.06.2020
 */

//Factory implementation for Google cloud platform resources
public class GoogleResourceFactory implements ResourceFactory {

    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new GoogleComputeEngineInstance(capacity);
    }

    @Override
    public Storage createStorage(int capMib) {
        return new GoogleCloudStorage(capMib);
    }
}