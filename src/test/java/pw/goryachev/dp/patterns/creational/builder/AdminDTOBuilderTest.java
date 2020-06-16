package pw.goryachev.dp.patterns.creational.builder;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

/**
 * Created by morgan on 17.06.2020
 */

public class AdminDTOBuilderTest {

    @Test
    public void buildAdminTest() {
        User user = createUser();
        // Client has to provide director with concrete builder
        AdminDTO dto = directBuild(AdminDTO.getBuilder(), user);
        System.out.println(dto);
    }


    /**
     * This method serves the role of director in builder pattern.
     */
    private static AdminDTO directBuild(AdminDTO.AdminDTOBuilder builder, User user) {
        return builder
                .withFirstName(user.getFirstName())
                .withLastName(user.getLastName())
                .withBirthday(user.getBirthday())
                .withAddress(user.getAddress())
                .build();
    }

    /**
     * Returns a sample user.
     */
    public static User createUser() {
        User user = new User();
        user.setBirthday(LocalDate.of(1960, 5, 6));
        user.setFirstName("Ron");
        user.setLastName("Swanson");
        Address address = new Address();
        address.setHouseNumber("100");
        address.setStreet("State Street");
        address.setCity("Pawnee");
        address.setState("Indiana");
        address.setZipcode("47998");
        user.setAddress(address);
        return user;
    }
}
