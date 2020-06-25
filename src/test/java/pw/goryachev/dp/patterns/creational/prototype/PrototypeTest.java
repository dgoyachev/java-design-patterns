package pw.goryachev.dp.patterns.creational.prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrototypeTest {

    @Test
    public void testPrototype() throws CloneNotSupportedException {
        Swordsman s1 = new Swordsman();
        s1.move(new Point3D(-10,0,0), 20);
        s1.attack();

        assertEquals(s1.getState(), "attacking");
        assertEquals(s1.getPosition(), new Point3D(-200, 0, 0));

        System.out.println(s1);
        Swordsman s2 = (Swordsman) s1.clone();

        assertEquals(s2.getState(), "idle");
        assertEquals(s2.getPosition(), new Point3D(0, 0, 0));

        System.out.println("Cloned "+s2);
    }
}