
public class Student extends Person {
    private String major;
    private int creditsCompleted;

    public Student(String name, String email, String major, int creditsCompleted) {
        super(name, email);
        this.major = major;
        this.creditsCompleted = creditsCompleted;
    }


    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getCreditsCompleted() {
        return creditsCompleted;
    }

    public void setCreditsCompleted(int creditsCompleted) {
        this.creditsCompleted = creditsCompleted;
    }


    @Override
    public String toString() {
        return "Student{" +
                "ID='" + id + '\'' +
                ", Name='" + name + '\'' +
                ", Email='" + email + '\'' +
                ", Major='" + major + '\'' +
                ", CreditsCompleted=" + creditsCompleted +
                '}';
    }

    @Override
    public void assignCourse(String courseName) {
        // Students don't assign courses, can leave empty or print a message
    }
}
