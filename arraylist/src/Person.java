import java.util.Date;

class Person {
    private String name;
    private String role;
    private Date dateOfBirth;
    private Account account;
    private Address address;

    public Person(String name, String role) throws InvalidNameException {
        if (name == null || name.trim().length() == 0) {
            throw new InvalidNameException("Name cannot be null or empty");
        }
        this.name = name;
        this.role = role;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return name + " (" + role + ")";
    }
}
