// Project:             lab12
// Class:               ITCS1820 Java Programming I
// Date:                4/4/2025
// Author:              Marcum
// Description:         Comparable Interface
package marcum;

public abstract class Contact implements Comparable<Contact> {

    private String name;
    private String email;
    private String phone;
    private Address address;
    private static int numberOfContacts;

    @Override
    public int compareTo(Contact contactObj) {
        return this.name.compareTo(contactObj.getName());
    }

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
            ContactType type) throws ContactException {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = new Address(street, city, state, zip);
        this.type = type;
        ++numberOfContacts;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.phone + ", " + this.email + ", "
                + this.address.toString() + ", " + this.type;
    }

    public static int getCount() {
        return numberOfContacts;
    }
    
    public static void decrementCount() {
        --numberOfContacts;
    }

    public String getInfo() {
        return String.join(", ", this.name, this.email, this.phone, this.address.getAddress());
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Address getAddress() {
        return this.address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    private class Address {

        private String street;
        private String city;
        private String state;
        private String zip;

        public Address(String street, String city, String state, String zip) throws ContactException {
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

        public final String validateState(String string) throws ContactException {
            if (string.length() != 2) {
                throw new ContactException("State: Not 2 characters");
            }
            return string.toUpperCase();
        }

        private String validateZip(String string) throws ContactException {
            if (!string.matches("^\\d{5}$")) {
                throw new ContactException("Zip: Incorrect format");
            }
            return string;
        }

        @Override
        public String toString() {
            return this.street + ", " + this.city + ", " + this.state + ", " + this.zip;
        }

        public String getAddress() {
            return String.join(", ", this.street, this.city, this.state, this.zip);
        }

        public String getStreet() {
            return this.street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public String getCity() {
            return this.city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getState() {
            return this.state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getZip() {
            return this.zip;
        }

        public void setZip(String zip) {
            this.zip = zip;
        }
    }
}
