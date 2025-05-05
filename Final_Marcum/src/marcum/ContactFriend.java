// Project:             Final
// Class:               ITCS1820 Java Programming I
// Date:                5/5/2025
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
            int yearMet) throws ContactException, ContactYearMetException {
        super(name, email, phone, street, city, state, zip, type);
        this.yearMet = validateYearMet(yearMet); // Task #3 - validate year met method
    }

    @Override
    public String toString() {
        return super.toString() + ", " + yearMet;
    }

    @Override
    public String toFile() {
        return super.toFile() + "," + yearMet;
    }

    // Task #3 - validate year met method
    private int validateYearMet(int yearMet) throws ContactYearMetException {
        if (yearMet < 1950 || yearMet > 2025) {
            throw new ContactYearMetException("Year met not between 1950 and 2025");
        }
        return yearMet;
    }
}
