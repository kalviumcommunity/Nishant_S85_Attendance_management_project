import com.school.Student;
import com.school.Course;

public class Main {
    public static void main(String[] args) {
        Student[] students = {
            new Student("Madhav", 24111386),
            new Student("Nishant", 22111387),
        };

        Course[] courses = {
            new Course("DSA", "M11"),
            new Course("OOPS", "S01")
        };

        System.out.println("Students Details:");
        for (Student s : students) {
            s.display();
        }

        System.out.println("\nCourses Details:");
        for (Course c : courses) {
            c.display();
        }
    }
}
