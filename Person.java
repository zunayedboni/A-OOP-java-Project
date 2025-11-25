// Person.java
import java.util.UUID;

public abstract class Person implements Identifiable {
    protected String id;
    protected String name;
    protected String email;

    // Constructor
    public Person(String name, String email) {
        this.id = generateID();
        this.name = name;
        this.email = email;
    }

    // Implement getID from Identifiable
    @Override
    public String getID() {
        return id;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Private method to generate unique ID
    private String generateID() {
        return UUID.randomUUID().toString();
    }

    // Optional abstract method for faculty-specific behavior
    public abstract void assignCourse(String courseName);
}
