
import java.util.Random;
import javax.print.DocFlavor.STRING;

public class Student {
    private String id;
    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        this.id = generateId();

    }

    public Student(String name) {
        this.name = name;
        this.grade = 10;
        this.id = generateId();

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

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setId(String id) {
        this.id = id;
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
        return "" + ((int) (Math.random() * 7) + 2) + ((int) (Math.random() * 7) + 2)
                + ((int) (Math.random() * 7) + 2) + "-" + ((int) (Math.random() * 10))
                + ((int) (Math.random() * 10)) + ((int) (Math.random() * 10))
                + ((int) (Math.random() * 10));

    }
}
