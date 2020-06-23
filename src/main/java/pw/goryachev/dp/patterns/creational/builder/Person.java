package pw.goryachev.dp.patterns.creational.builder;

/**
 * Created by morgan on 24.06.2020
 */

public class Person
{
    private final String lastName;
    private final String firstName;
    private final String middleName;
    private final String salutation;
    private final String suffix;
    private final String streetAddress;
    private final String city;
    private final String state;
    private final boolean isFemale;
    private final boolean isEmployed;
    private final boolean isHomeOwner;

    private Person(String lastName, String firstName, String middleName, String salutation, String suffix, String streetAddress, String city, String state, boolean isFemale, boolean isEmployed, boolean isHomeOwner) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.salutation = salutation;
        this.suffix = suffix;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.isFemale = isFemale;
        this.isEmployed = isEmployed;
        this.isHomeOwner = isHomeOwner;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getSalutation() {
        return salutation;
    }

    public String getSuffix() {
        return suffix;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public boolean isFemale() {
        return isFemale;
    }

    public boolean isEmployed() {
        return isEmployed;
    }

    public boolean isHomeOwner() {
        return isHomeOwner;
    }

    public static PersonBuilder getBuilder() {
        return new PersonBuilder();
    }

    public static class PersonBuilder {
        private String lastName;
        private String firstName;
        private String middleName;
        private String salutation;
        private String suffix;
        private String streetAddress;
        private String city;
        private String state;
        private boolean isFemale;
        private boolean isEmployed;
        private boolean isHomeOwner;

        public PersonBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public PersonBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public PersonBuilder setMiddleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public PersonBuilder setSalutation(String salutation) {
            this.salutation = salutation;
            return this;
        }

        public PersonBuilder setSuffix(String suffix) {
            this.suffix = suffix;
            return this;
        }

        public PersonBuilder setStreetAddress(String streetAddress) {
            this.streetAddress = streetAddress;
            return this;
        }

        public PersonBuilder setCity(String city) {
            this.city = city;
            return this;
        }

        public PersonBuilder setState(String state) {
            this.state = state;
            return this;
        }

        public PersonBuilder setIsFemale(boolean isFemale) {
            this.isFemale = isFemale;
            return this;
        }

        public PersonBuilder setIsEmployed(boolean isEmployed) {
            this.isEmployed = isEmployed;
            return this;
        }

        public PersonBuilder setIsHomeOwner(boolean isHomeOwner) {
            this.isHomeOwner = isHomeOwner;
            return this;
        }

        public Person createPerson() {
            return new Person(lastName, firstName, middleName, salutation, suffix, streetAddress, city, state, isFemale, isEmployed, isHomeOwner);
        }
    }    
}
