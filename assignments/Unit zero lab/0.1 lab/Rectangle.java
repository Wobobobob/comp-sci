public class Rectangle {
    int length;
    int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public String toString() {
        String toString =
                "the width of the rectangle is " + width + " the width of the rectangle " + length;
        return toString;
    }

    public boolean equals(Rectangle other) {
        if (other.length == length && other.width == width) {
            return true;
        } else {
            return false;
        }
    }

    public int calculateArea() {
        int area = width * length;
        return area;
    }

    public int calculatePerimeter() {
        int perimiter = width * 2 + length * 2;
        return perimiter;
    }

    public double calculateDiagonal() {
        double csquared = Math.pow(width, 2) + Math.pow(length, 2);
        double c = Math.sqrt(csquared);
        return c;
    }

    public void setLength(int newLength) {
        width = newLength;

    }

    public void setWidth(int newWidth) {
        width = newWidth;

    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }


}
