package util;

import javax.swing.*;
import java.awt.*;

public class ShowInFrame {

    public static void show(String title, JComponent c){

        JFrame f=new JFrame(title);
        f.add(c);
        f.pack();
        f.setVisible(true);
    }

    public static void show(JComponent c){show("",c);}
}
