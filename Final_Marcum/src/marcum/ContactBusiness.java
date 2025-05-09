// Project:             Final
// Class:               ITCS1820 Java Programming I
// Date:                5/5/2025
// Author:              Marcum
// Description:         Business subclass of Contact
package marcum;

public class ContactBusiness extends Contact {
    private String company;

    public ContactBusiness(
            String name,
            String email,
            String phone,
            String street,
            String city,
            String state,
            String zip,
            ContactType type,
            String company) throws ContactException {
        super(name, email, phone, street, city, state, zip, type);
        this.company = company;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + company;
    }

    @Override
    public String toFile() {
        return super.toFile() + "," + company;
    }
}
