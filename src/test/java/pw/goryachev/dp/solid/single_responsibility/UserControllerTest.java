package pw.goryachev.dp.solid.single_responsibility;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class UserControllerTest {

    private static final String VALID_USER_JSON = "{\"name\": \"Randy\", \"email\": \"randy@email.com\", \"address\":\"110 Sugar lane\"}";
    private static final String INVALID_USER_JSON = "{\"name\": \"Sam\", \"email\": \"sam@email\", \"address\":\"111 Sugar lane\"}";
    private pw.goryachev.dp.solid.single_responsibility.correct.UserController controllerCorrect;
    private pw.goryachev.dp.solid.single_responsibility.incorrect.UserController controllerIncorrect;

    @BeforeEach
    void setUp() {

        this.controllerCorrect = new pw.goryachev.dp.solid.single_responsibility.correct.UserController(new UserPersistenceService(), new UserValidator());
        this.controllerIncorrect = new pw.goryachev.dp.solid.single_responsibility.incorrect.UserController();

    }

    @Test
    void createUserCorrect() throws IOException {
        String response = controllerCorrect.createUser(VALID_USER_JSON);
        assertEquals(response, "SUCCESS");
        response = controllerCorrect.createUser(INVALID_USER_JSON);
        assertEquals(response, "ERROR");
    }

    @Test
    void createUserIncorrect() throws IOException {
        String response = controllerIncorrect.createUser(VALID_USER_JSON);
        assertEquals(response, "SUCCESS");
        response = controllerIncorrect.createUser(INVALID_USER_JSON);
        assertEquals(response, "ERROR");
    }
}