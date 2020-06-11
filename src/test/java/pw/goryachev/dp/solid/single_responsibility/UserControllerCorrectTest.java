package pw.goryachev.dp.solid.single_responsibility;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class UserControllerCorrectTest {

    private static final String VALID_USER_JSON = "{\"name\": \"Randy\", \"email\": \"randy@email.com\", \"address\":\"110 Sugar lane\"}";
    private static final String INVALID_USER_JSON = "{\"name\": \"Sam\", \"email\": \"sam@email\", \"address\":\"111 Sugar lane\"}";
    private UserControllerCorrect controller;

    @BeforeEach
    void setUp() {
        this.controller = new UserControllerCorrect(new UserPersistenceService(), new UserValidator());
    }

    @Test
    void createUser() throws IOException {
        String response = controller.createUser(VALID_USER_JSON);
        assertEquals(response, "SUCCESS");
        response = controller.createUser(INVALID_USER_JSON);
        assertEquals(response, "ERROR");
    }
}