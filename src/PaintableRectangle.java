import java.awt.*;

public class PaintableRectangle extends SimpleOval implements Paintable{
    public PaintableRectangle(double x, double y, double width, double height,Color color) {
        super(x, y, width, height,color);
    }
    public PaintableRectangle(double x, double y, double width, double height) {
        super(x, y, width, height);
    }

    @Override
    public void paintTo(Graphics g) {
        g.fillRect((int) pos.x, (int) pos.y, (int) width, (int) height);
        g.setColor(color);
    }
}