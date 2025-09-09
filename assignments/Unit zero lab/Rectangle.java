public class Rectangle {
    int length;
    int width;

    public Rectangle(int newLength, int newWidth) {

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

    public int calculatePerimiter() {
        int perimiter = width * 2 + length * 2;
        return perimiter;
    }

    public double calculateDiagonal() {
        double Csquared = Math.pow(width, length);
        double C = Math.sqrt(Csquared);
        return C;
    }

    public void setLength(int newLength){
        width = newLength;

    }
     public void setLength(int newWidth){
        width = newWidth;
        
    }

}
