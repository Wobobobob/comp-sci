import javax.print.DocFlavor.STRING;
import java.util.Random;


public class Student {
    private String id;
    private String name;
    private int grade;

    public Student(String name, int grade) {

    }

    public Student(String name) {

    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public String getId() {
        return id;
    }

    public boolean equals(Student other) {
        if (other.id.equals(id) && other.name.equals(name) && other.grade == grade) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        String toString = "This student is in grade " + grade + " this student's name is " + name
                + " and the students id is " + id;
        return toString;
    }

    public String generateId() {
        return ((int) (Math.random() * 7) + 2) + ((int) (Math.random() * 7) + 2)
                + ((int) (Math.random() * 7) + 2) + "-" + ((int) (Math.random() * 10))
                + ((int) (Math.random() * 10)) + ((int) (Math.random() * 10));

    }
}
