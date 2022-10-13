import javax.swing.*;
import java.awt.*;

public class SizedPanel extends JPanel {
    int preferredWidth = 1000;
    int preferredHeight = 800;

    public SizedPanel(int w, int h) {
        this.preferredWidth = w;
        this.preferredHeight = h;
    }

    public SizedPanel() {
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(preferredWidth, preferredHeight);
    }
}