import javax.swing.*;
import util.ShowInFrame;

public class FirstPanel extends JPanel {

    public static void main(String[] args){
        ShowInFrame.show("Hello there", new SizedPanel());
    }

    @Override
    public void paintComponent(java.awt.Graphics g){
        g.fillOval(40, 160, 200, 50);
        g.fillOval(50, 50, 80, 60);
        g.fillOval(150, 50, 80, 60);
    }
}
