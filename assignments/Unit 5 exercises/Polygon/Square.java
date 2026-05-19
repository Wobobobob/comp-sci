public class Square extends Rectangle{
    private double length;
    private double width;

    public Square(double sidelength){
        super(4,4);
        this.length = sidelength;
        this.width = sidelength;
    }

    public Square() {
        super(4,4);
        this.length = 4;
        this.width = 4;
    }

    public double getArea() {
        return length * width;
    }

    public String toString() {
        return super.toString() + "This is a  polygon. It is a rectangle with a length of " + length + " and width of " + width + ". Its area is " + this.getArea();
    }
}