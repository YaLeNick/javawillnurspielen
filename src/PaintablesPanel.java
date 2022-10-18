import util.ShowInFrame;
import java.util.*;

public class PaintablesPanel extends SizedPanel{
    List<Paintable> pas;

    public PaintablesPanel(List<Paintable> pas){this.pas=pas;}

    public void paintComponent(java.awt.Graphics g){
        for(Paintable pa:pas) pa.paintTo(g);
    }

    public static void main(String[]args){
        List<Paintable> ps = new ArrayList<Paintable>();
        ps.add(new PaintableOval(50, 50, 50, 300));
        ps.add(new PaintableRectangle(120, 80, 130, 50));

        ShowInFrame.show("Hello", new PaintablesPanel(ps));
    }
}
