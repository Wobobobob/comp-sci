public class CatTester {

    public static void main(String[] args) {
        Cat ryan = new Cat("Ryan", "John M. Bobbingson", 6, 1234 + "");
        Cat ryanCopy = new Cat("Ryan", "John M. Bobbingson", 6, 1234 + "");
        System.out.println(ryan.getCatChar());
        System.out.println(ryan.equals(ryanCopy));
        System.out.println(PurrfectUtils.generateRandomNumber(2, 100));
    }
}
