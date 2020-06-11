package pw.goryachev.dp.solid.single_responsibility.correct;

import com.fasterxml.jackson.databind.ObjectMapper;
import pw.goryachev.dp.solid.single_responsibility.User;
import pw.goryachev.dp.solid.single_responsibility.UserPersistenceService;
import pw.goryachev.dp.solid.single_responsibility.UserValidator;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by morgan on 11.06.2020
 */

public class UserController {

    private final UserPersistenceService persistenceService;
    private final UserValidator validator;

    public UserController(UserPersistenceService persistenceService, UserValidator validator) {
        this.persistenceService = persistenceService;
        this.validator = validator;
    }

    //Create a new user
    public String createUser(String userJson) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        User user = mapper.readValue(userJson, User.class);

        if(!validator.validateUser(user)) {
            return "ERROR";
        }

        persistenceService.saveUser(user);
        return "SUCCESS";
    }
}
