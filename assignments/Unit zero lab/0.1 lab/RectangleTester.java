public class RectangleTester {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(3, 2);
        Rectangle rectangle2 = new Rectangle(5, 8);
        System.out.println(rectangle1.toString());

        System.out.println(rectangle2.toString());

        rectangle1.setLength(13);

        rectangle2.setWidth(3);

        System.out.println(rectangle1);
        System.out.print(" this is the transformed rectangle 1");
        System.out.println(rectangle2);
        System.out.println(" this is the transformed rectangle 2");
        System.out.println(rectangle1.equals(rectangle2));
        System.out.println(
                " this is the boolean detirmining if rectangle 1 and 2 have the same dimensions");
        System.out.println(rectangle1.calculateDiagonal());
        System.out.println("this is the diagonal of rectangle 1");
        System.out.println(rectangle2.calculateDiagonal());
        System.out.println("this is the diagonal of rectangle 2");
    }
}
