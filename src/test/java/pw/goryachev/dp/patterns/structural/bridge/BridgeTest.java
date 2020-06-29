package pw.goryachev.dp.patterns.structural.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BridgeTest {

    @Test
    public void bridgeTest() {

        FifoCollection<Integer> collection = new Queue<>(new SinglyLinkedList<>());

        collection.offer(10);
        collection.offer(40);
        collection.offer(99);

        assertEquals(collection.poll(), 10);
        assertEquals(collection.poll(), 40);
        assertEquals(collection.poll(), 99);

        assertNull(collection.poll());
    }
}