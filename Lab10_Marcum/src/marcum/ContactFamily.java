// Project:             Lab10
// Class:               ITCS1820 Java Programming I
// Date:                3/26/2025
// Author:              Marcum
// Description:         Family subclass of Contact
package marcum;

public class ContactFamily extends Contact {
    private String relationship;

    public ContactFamily(
            String name,
            String email,
            String phone,
            String street,
            String city,
            String state,
            String zip,
            ContactType type,
            String relationship) throws ContactException {
        super(name, email, phone, street, city, state, zip, type);
        this.relationship = relationship;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + relationship;
    }
}
