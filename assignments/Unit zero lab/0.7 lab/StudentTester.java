public class StudentTester {
    public static void main(String[] args) {
        Student cartman = new Student("Cartman", 4);
        Student kenny = new Student("Kenny");
        Student kyle = new Student("Kyle");
        Student stan = new Student("Stan", 4);
        System.out.println(cartman.toString());
        System.out.println(kenny.toString());
        System.out.println(kyle.toString());
        System.out.println(stan.toString());
        System.out.println(
                cartman.equals(kenny) + " should be false kenny and cartman are different");
        kenny.setGrade(4);
        System.out.println(kenny.getGrade() + " kenny's grade should be 4 now");
    }
}
