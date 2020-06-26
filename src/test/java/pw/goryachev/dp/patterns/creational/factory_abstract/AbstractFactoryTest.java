package pw.goryachev.dp.patterns.creational.factory_abstract;

import org.junit.jupiter.api.Test;
import pw.goryachev.dp.patterns.creational.factory_abstract.aws.AwsResourceFactory;
import pw.goryachev.dp.patterns.creational.factory_abstract.aws.Ec2Instance;
import pw.goryachev.dp.patterns.creational.factory_abstract.gcp.GoogleComputeEngineInstance;
import pw.goryachev.dp.patterns.creational.factory_abstract.gcp.GoogleResourceFactory;

import static org.junit.jupiter.api.Assertions.*;

class AbstractFactoryTest {


    @Test
    public void testAbstractFactory() {
        Client aws = new Client(new AwsResourceFactory());
        Instance i1 = aws.createServer(Instance.Capacity.micro, 20480);
        i1.start();
        i1.stop();
        assertEquals(i1.getClass(), Ec2Instance.class);

        System.out.println("***************************************");
        Client gcp = new Client(new GoogleResourceFactory());
        i1 = gcp.createServer(Instance.Capacity.micro, 20480);
        i1.start();
        i1.stop();

        assertEquals(i1.getClass(), GoogleComputeEngineInstance.class);
    }
}