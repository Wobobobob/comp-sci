public class Triangle extends Polygon {

    private double height;
    private double width;

    public double getArea() {
        return (height * width) / 2;
    }

    public Triangle() {
        super(3);
        this.height = 3;
        this.width = 4;

    }

    public Triangle(double height, double width) {
        super(3);
        this.height = height;
        this.width = width;

    }

    public String toString() {
        return super.toString() + "This is a  polygon. It is a triangle with a base of " + width + " and heigth of " + height + ". Its area is " + this.getArea();
    }

    

}
