public class Rectangle extends Polygon {

    private double length;
    private double width;

    public Rectangle() {
        super(4);
        this.length = 3;
        this.width = 4;

    }

    public Rectangle(double length, double width) {
        super(4);
        this.length = length;
        this.width = width;

    }

    public double getArea() {
        return length * width;
    }

    public String toString() {
        return super.toString() + "This is a  polygon. It is a rectangle with a length of " + length + " and width of " + width + ". Its area is " + this.getArea();
    }

}
