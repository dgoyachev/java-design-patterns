package pw.goryachev.dp.patterns.creational.builder;

import java.time.LocalDate;
import java.time.Period;

/**
 * Created by morgan on 17.06.2020
 */

public class AdminDTO {

    private String name;

    private String address;

    private String age;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getAge() {
        return age;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setAddress(String address) {
        this.address = address;
    }

    private void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "name=" + name + "\nage=" + age + "\naddress=" + address ;
    }

    //Get builder instance
    public static AdminDTOBuilder getBuilder() {
        return new AdminDTOBuilder();
    }

    //Builder
    public static class AdminDTOBuilder {

        private String firstName;

        private String lastName;

        private String age;

        private String address;

        private AdminDTO AdminDTO;

        public AdminDTOBuilder withFirstName(String fname) {
            this.firstName = fname;
            return this;
        }

        public AdminDTOBuilder withLastName(String lname) {
            this.lastName = lname;
            return this;
        }

        public AdminDTOBuilder withBirthday(LocalDate date) {
            age = Integer.toString(Period.between(date, LocalDate.now()).getYears());
            return this;
        }

        public AdminDTOBuilder withAddress(Address address) {
            this.address = address.getHouseNumber() + " " +address.getStreet()
                    + "\n"+address.getCity()+", "+address.getState()+" "+address.getZipcode();

            return this;
        }

        public AdminDTO build() {
            this.AdminDTO = new AdminDTO();
            AdminDTO.setName(firstName+" " + lastName);
            AdminDTO.setAddress(address);
            AdminDTO.setAge(age);
            return this.AdminDTO;
        }

        public AdminDTO getAdminDTO() {
            return this.AdminDTO;
        }
    }
}
