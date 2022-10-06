package util;
import java.awt.*;
import java.awt.Dimension.*;
import javax.swing.*;
import util.ShowInFrame;

public class SizedPanel extends JPanel{
    int preferredWidth=400;
    int preferredHeight=300;

    public static void main(String[] args){
        ShowInFrame.show(new SizedPanel());
    }

    public SizedPanel(int w, int h){
        preferredWidth=w;
        preferredHeight=h;
    }
    public SizedPanel(){}

    public Dimension getPrefferedSize(){
        return new Dimension(preferredWidth, preferredHeight);
    }
}
