import java.awt.*;

public class SimpleOval extends GeometricObject {

    public SimpleOval(Vertex pos, double width, double height) {
        super(pos, width, height);
    }
    public SimpleOval(Vertex pos, double width, double height, Color color) {
        super(pos, width, height, color);
    }

    public SimpleOval(double x, double y, double width, double height) {
        super(new Vertex(x, y), width, height);
    }
    public SimpleOval(double x, double y, double width, double height, Color color) {
        super(new Vertex(x, y), width, height, color);
    }

    @Override
    public double area() {
        return Math.PI * width * height / 4;
    }

    @Override
    public String toString() {
        return "SimpleOval" + super.toString();

    }

}