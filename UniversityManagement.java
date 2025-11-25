
import java.util.ArrayList;

public class UniversityManagement {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();

        
        Student student1 = new Student("Abul Kalam", "abul@example.com", "Computer Science", 60);
        Student student2 = new Student("Abdul Jabbar", "jabbar@example.com", "History", 30);

        
        Faculty faculty1 = new Faculty("Sohel Khan", "sohel@example.com", "Math", 75000);

  
        people.add(student1);
        people.add(student2);
        people.add(faculty1);

   
        for (Person person : people) {
            System.out.println("ID: " + person.getID() + ", Name: " + person.getName());

            if (person instanceof Student) {
                System.out.println(person.toString());
            } else if (person instanceof Faculty) {
                person.assignCourse("Object-Oriented Design");
            }

            System.out.println("-----------------------------");
        }
    }
}
