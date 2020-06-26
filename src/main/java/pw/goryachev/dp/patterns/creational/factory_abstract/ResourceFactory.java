package pw.goryachev.dp.patterns.creational.factory_abstract;

//Abstract factory with methods defined for each object type.
public interface ResourceFactory {
    Instance createInstance(Instance.Capacity capacity);

    Storage createStorage(int capMib);
}