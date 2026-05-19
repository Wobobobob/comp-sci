
import java.awt.Graphics;

public class Triangle extends Shape {

    public Triangle(int[] xCoord, int[] yCoord) {
        super(xCoord, yCoord);
    }

    @Override
    public void draw(Graphics g) {
        g.drawPolygon(this.xCoord, this.yCoord, 3);
        g.fillPolygon(this.xCoord, this.yCoord, 3);

    }

    @Override
    public double getArea() {
        double area = 0;
        for (int i = 0; i < xCoord.length; i++) {
            int b = (i + 1) % xCoord.length;
            area += xCoord[i] * yCoord[b];
            area -= xCoord[b] * yCoord[i];

        }
        return Math.abs(area) / 2;
    }
}
