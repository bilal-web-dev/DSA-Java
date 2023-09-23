class Student extends Person {
    private String studentId;

    public Student(String name, String studentId) throws InvalidNameException {
        super(name, "student");
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return name + " (" + role + " - " + studentId + ")";
    }
}