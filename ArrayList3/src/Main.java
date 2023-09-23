import java.util.ArrayList;
import java.util.Date;

class CampusManagementSystem {
    private ArrayList<Person> people;

    public CampusManagementSystem() {
        this.people = new ArrayList<>();
    }

    public void addPerson(Person person) throws InvalidPersonException {
        if (person == null) {
            throw new InvalidPersonException("Person cannot be null");
        }
        people.add(person);
    }

    public ArrayList<Person> getPeople() {
        return people;
    }
}

class InvalidNameException extends Exception {
    public InvalidNameException(String message) {
        super(message);
    }
}

class InvalidPersonException extends Exception {
    public InvalidPersonException(String message) {
        super(message);
    }
}
