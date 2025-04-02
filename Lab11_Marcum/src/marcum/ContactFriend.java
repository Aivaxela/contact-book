// Project:             Lab11
// Class:               ITCS1820 Java Programming I
// Date:                3/26/2025
// Author:              Marcum
// Description:         Friend subclass of Contact
package marcum;

public class ContactFriend extends Contact {
    private int yearMet;

    public ContactFriend(
            String name,
            String email,
            String phone,
            String street,
            String city,
            String state,
            String zip,
            ContactType type,
            int yearMet) throws ContactException {
        super(name, email, phone, street, city, state, zip, type);
        this.yearMet = yearMet;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + yearMet;
    }
}
