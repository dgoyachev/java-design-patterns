package pw.goryachev.dp.solid.single_responsibility;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by morgan on 11.06.2020
 */

// corrected controller - validation and storage now in separate classes

public class UserControllerCorrect {

    private final UserPersistenceService persistenceService;
    private final UserValidator validator;

    public UserControllerCorrect(UserPersistenceService persistenceService, UserValidator validator) {
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
