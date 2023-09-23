class Teacher extends Person {
    private String employeeId;

    public Teacher(String name, String employeeId) throws InvalidNameException {
        super(name, "teacher");
        this.employeeId = employeeId;
    }

    @Override
    public String toString() {
        return name + " (" + role + " - " + employeeId + ")";
    }
}