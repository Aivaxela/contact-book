// Project:             Lab7
// Class:               ITCS1820 Java Programming I
// Date:                3/3/2025
// Author:              Marcum
// Description:         String manupulation
package marcum;

public class Contact {

    private String name;
    private String email;
    private String phone;
    private Address address;
    private static int numberOfContacts;

    public static enum ContactType {
        BUSINESS, FAMILY, FRIEND
    }
    private ContactType type;

    public Contact(
            String name,
            String email,
            String phone,
            String street,
            String city,
            String state,
            String zip,
            ContactType type) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = new Address(street, city, state, zip);
        this.type = type;
        ++numberOfContacts;
    }

    @Override
    public String toString() {
        return name + ", " + phone + ", " + email + ", "
                + address.toString() + ", " + type;
    }

    public int getCount() {
        return numberOfContacts;
    }

    public String getInfo() {
        return String.join(", ", name, email, phone, address.getAddress());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    private class Address {

        private String street;
        private String city;
        private String state;
        private String zip;

        public Address(String street, String city, String state, String zip) {
            this.street = validateStreet(street);
            this.city = validateCity(city);
            this.state = validateState(state);
            this.zip = validateZip(zip);
        }

        private String validateStreet(String string) {
            return string.length() > 10 ? string.substring(0, 10) : string;
        }

        private String validateCity(String string) {
            return Character.toUpperCase(string.charAt(0)) + string.substring(1);
        }

        private String validateState(String string) {
            return string.length() != 2 ? "Error!" : string.toUpperCase();
        }

        private String validateZip(String string) {
            return !string.matches("^\\d{5}$") ? "Error!" : string;
        }

        @Override
        public String toString() {
            return street + ", " + city + ", " + state + ", " + zip;
        }

        public String getAddress() {
            return String.join(", ", street, city, state, zip);
        }

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getZip() {
            return zip;
        }

        public void setZip(String zip) {
            this.zip = zip;
        }
    }
}
