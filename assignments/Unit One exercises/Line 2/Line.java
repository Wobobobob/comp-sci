public class Line {
    private Point p1;
    private Point p2;
    private int a;
    private int b;
    private int c;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
        this.a = -(p2.getY() - p1.getY());
        this.b = p2.getX() - p1.getX();
        this.c = -(this.a * p1.getX() + p1.getY() * this.b);
    }


    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }


    Line(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public double calculateSlope(Point p1, Point p2) {
        int x1 = p1.getX();
        int y1 = p1.getY();
        int x2 = p2.getX();
        int y2 = p2.getY();
        if (x2 - x1 == 0) {
            throw new ArithmeticException("Slope is undefined for vertical lines (b=0).");
        }
        return ((double) (y2 - y1) / (x2 - x1));
    }

    public String toString() {
        return a + "x + " + b + "y + " + c + " = 0";
    }

    public boolean isCoordinateOnLine(Point p) {
        int x = p.getX();
        int y = p.getY();
        return (a * x + b * y + c) == 0;
    }

    public String generateSlopeFormula() {
        return "(y - y1) = m(x - x1)";
    }

    // Calculate slope using the line's stored points
    public double calculateSlope() {
        return calculateSlope(this.p1, this.p2);
    }

    // Alias for calculateSlope() to match test requirements
    public double calculateSlopeFromPoints() {
        return calculateSlope();
    }

    // Generate point-slope formula with actual values
    public String generatePointSlopeFormula() {
        double slope = calculateSlope();
        return String.format("(y - %d) = %.1f(x - %d)", p1.getY(), slope, p1.getX());
    }
}
