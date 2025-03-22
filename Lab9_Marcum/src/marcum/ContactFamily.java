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
            String relationship) {
        super(name, email, phone, street, city, state, zip, type);
        this.relationship = relationship;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + relationship;
    }
}
