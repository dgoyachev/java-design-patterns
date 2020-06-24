package pw.goryachev.dp.patterns.creational.factory_method;

import org.junit.jupiter.api.Test;
import pw.goryachev.dp.patterns.creational.factory_method.message.JSONMessage;
import pw.goryachev.dp.patterns.creational.factory_method.message.TextMessage;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MessageCreatorTest {

    @Test
    public void testFactoryMethod() {
        assertEquals(new JSONMessageCreator().getMessage().getClass(), JSONMessage.class);
        assertEquals(new TextMessageCreator().getMessage().getClass(), TextMessage.class);
    }
}