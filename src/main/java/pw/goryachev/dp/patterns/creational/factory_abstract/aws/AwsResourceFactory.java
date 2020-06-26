package pw.goryachev.dp.patterns.creational.factory_abstract.aws;

import pw.goryachev.dp.patterns.creational.factory_abstract.Instance;
import pw.goryachev.dp.patterns.creational.factory_abstract.ResourceFactory;
import pw.goryachev.dp.patterns.creational.factory_abstract.Storage;

/**
 * Created by morgan on 26.06.2020
 */

//Factory implementation for Amazon cloud platform resources
public class AwsResourceFactory implements ResourceFactory {

    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new Ec2Instance(capacity);
    }

    @Override
    public Storage createStorage(int capMib) {
        return new S3Storage(capMib);
    }
}