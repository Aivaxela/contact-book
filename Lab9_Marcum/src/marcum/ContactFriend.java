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
            int yearMet) {
        super(name, email, phone, street, city, state, zip, type);
        this.yearMet = yearMet;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + yearMet;
    }
}
