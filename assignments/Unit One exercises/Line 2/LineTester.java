public class LineTester {
    public static void main(String[] args) {
        // Create a simple line y = x (points (0,0) and (2,2))
        Point p1 = new Point(0, 0);
        Point p2 = new Point(2, 2);
        Line line = new Line(p1, p2);

        System.out.println("Line: " + line);
        System.out.println("Slope (calculated): " + line.calculateSlope(p1, p2));

        Point on = new Point(1, 1);
        Point off = new Point(0, 1);
        System.out.println("Is (1,1) on the line? " + line.isCoordinateOnLine(on));
        System.out.println("Is (0,1) on the line? " + line.isCoordinateOnLine(off));

        // Test vertical line slope handling
        Point v1 = new Point(3, 0);
        Point v2 = new Point(3, 5);
        Line vline = new Line(v1, v2);
        System.out.println("Vertical line: " + vline);
        try {
            System.out.println("Slope (vertical): " + vline.calculateSlope(v1, v2));
        } catch (ArithmeticException e) {
            System.out.println("Caught expected exception for vertical slope: " + e.getMessage());
        }

        // Show slope formula template
        System.out.println("Slope formula template: " + line.generateSlopeFormula());
    }
}

