public class StaticDemo {
    public static void main(String[] args) {
        // if you have no constructor, java provides a default constructor and assigns default
        // values to null
        StaticDemo demo = new StaticDemo();

    }
    //this method belongs to the object of the class
    public void firstIfTest() {
        int x = 4;
        int y = 5;
        int z = 4;
        if (x < y) {
            System.out.println("x is less than y and x is equal to z");
        }
        if (x == z) {
            System.out.println("x is equal to z");
        }
    }

    public static String secondIfTest() {
        int x = 4;
        int y = 5;
        int z = 4;
        if (x < y) {
            return "x is less than y and x is equal to z";
        }
        if (x == z) {
            return "x is equal to z";
        }

        return "hello there";
    }
}
