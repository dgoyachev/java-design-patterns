package pw.goryachev.dp.patterns.creational.object_pool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.function.Supplier;

/**
 * Created by morgan on 27.06.2020
 */

public class ObjectPool<T extends Poolable> {

    private final BlockingQueue<T> availablePool;
    private final int count;

    public ObjectPool(Supplier<T> creator, int count) {
        this.count = count;
        availablePool = new LinkedBlockingQueue<>();
        for(int i=0; i< this.count;i++) {
            availablePool.offer(creator.get());
        }
    }

    public T get() {
        try {
            return availablePool.take();
        }catch(InterruptedException ex) {
            System.err.println("take() was interrupted");
        }
        return null;
    }

    public void release(T obj) {
        obj.reset();
        try {
            availablePool.put(obj);
        } catch (InterruptedException e) {
            System.err.println("put() was interrupted");
        }
    }

    public int getCount() {
        return count;
    }
}