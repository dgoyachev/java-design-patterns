package pw.goryachev.dp.patterns.creational.singleton;

import org.junit.jupiter.api.Test;
import pw.goryachev.dp.patterns.creational.singleton.eager.EagerRegistry;
import pw.goryachev.dp.patterns.creational.singleton.holder.HolderRegistry;
import pw.goryachev.dp.patterns.creational.singleton.lazy.LazyRegistry;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by morgan on 26.06.2020
 */

public class SingletonTest {

    @Test
    public void lazySingletonTest() {
        LazyRegistry lazy1 = LazyRegistry.getInstance();
        LazyRegistry lazy2 = LazyRegistry.getInstance();

        assertEquals(lazy1.getClass(), LazyRegistry.class);
        assertEquals(lazy1, lazy2);
        assertSame(lazy1, lazy2);
    }

    @Test
    public void eagerSingletonTest() {
        EagerRegistry eager1 = EagerRegistry.getInstance();
        EagerRegistry eager2 = EagerRegistry.getInstance();

        assertEquals(eager1.getClass(), EagerRegistry.class);
        assertEquals(eager1, eager2);
        assertSame(eager1, eager2);
    }

    @Test
    public void holderSingletonTest() {
        HolderRegistry holder1 = HolderRegistry.getInstance();
        HolderRegistry holder2 = HolderRegistry.getInstance();

        assertEquals(holder1.getClass(), HolderRegistry.class);
        assertEquals(holder1, holder2);
        assertSame(holder1, holder2);
    }
}
