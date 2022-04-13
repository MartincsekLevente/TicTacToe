package BaseGame;

import javax.swing.*;
import java.awt.*;

public class GridButton extends JButton {
        ImageIcon cross = new ImageIcon("cross.png");
        ImageIcon circle = new ImageIcon("circle.png");
   public GridButton() {

      //  this.setIcon(circle);
        this.setBackground(Color.WHITE);
        this.setFocusable(false);
    }

    public void setCross() {
        this.setIcon(new ImageIcon("cross.png"));
    }

    public void setCircle() {
        this.setIcon(new ImageIcon("circle.png"));
    }
}
