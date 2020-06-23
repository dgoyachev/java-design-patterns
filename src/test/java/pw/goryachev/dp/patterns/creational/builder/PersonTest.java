package pw.goryachev.dp.patterns.creational.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    public void testPersonBuilder() {
        Person person = Person.getBuilder()
                .setFirstName("firstName")
                .setLastName("lastName")
                .setCity("LA")
                .setState("California")
                .createPerson();

        assertEquals(person.getFirstName(), "firstName");
    }
}