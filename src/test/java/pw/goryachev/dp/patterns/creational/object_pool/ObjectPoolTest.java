package pw.goryachev.dp.patterns.creational.object_pool;

import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class ObjectPoolTest {

    public static final ObjectPool<Bitmap> bitmapPool = new ObjectPool<>(()->new Bitmap("Logo.bmp"), 5);

    @Test
    public void testObjectPool() {
        Bitmap b1 = bitmapPool.get();
        b1.setLocation(new Point(10, 10));
        Bitmap b2 = bitmapPool.get();
        b2.setLocation(new Point(-10, 0));

        assertEquals(bitmapPool.getCount(), 5);

        b1.draw();
        b2.draw();

        assertNotNull(b1.getLocation());

        bitmapPool.release(b1);
        bitmapPool.release(b2);

        assertNull(b1.getLocation());
    }
}