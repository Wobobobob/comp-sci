public class CourseTester {
    public static void main(String[] args) {
        StudentRecord s1 = new StudentRecord("Charlie Brown", new int[] {93, 95, 97});
        StudentRecord s2 = new StudentRecord("Eva White", new int[] {92, 94, 91});
        StudentRecord s3 = new StudentRecord("Frank Black", new int[] {75, 80, 85});

        StudentRecord[] students = new StudentRecord[] {s1, s2, s3};
        Course course = new Course("Mathematics", students);

        System.out.print(course.toString());
    }
}
