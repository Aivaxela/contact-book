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
            String company) {
        super(name, email, phone, street, city, state, zip, type);
        this.company = company;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + company;
    }
}
