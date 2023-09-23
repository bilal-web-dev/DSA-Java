class Admin extends Person {
    private String employeeId;

    public Admin(String name, String employeeId) throws InvalidNameException {
        super(name, "admin");
        this.employeeId = employeeId;
    }

    @Override
    public String toString() {
        return name + " (" + role + " - " + employeeId + ")";
    }
}