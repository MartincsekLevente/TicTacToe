package BaseGame;

import javax.swing.*;
import java.awt.*;


public class GridButton extends JButton {
    ImageIcon cross = new ImageIcon("cross.png");
    ImageIcon circle = new ImageIcon("circle.png");
    public String current;

    public GridButton() {

        //  this.setIcon(circle);
        this.setBackground(Color.WHITE);
        this.setFocusable(false);
        current = "null";
    }

    public void setCross() {
        this.setIcon(new ImageIcon("cross.png"));
        current = "cross";
    }

    public void setCircle() {
        this.setIcon(new ImageIcon("circle.png"));
        current = "circle";
    }
}
