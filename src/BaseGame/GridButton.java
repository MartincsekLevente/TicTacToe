package BaseGame;

import javax.swing.*;
import java.awt.*;


public class GridButton extends JButton {
    public String current;

    public GridButton() {

        //  this.setIcon(circle);
        this.setBackground(Color.WHITE);
        this.setFocusable(false);
        current = "null";
    }

    public void setCross() {
        this.setIcon(new ImageIcon("src/BaseGame/Images/cross.png"));
        current = "cross";
    }

    public void setCircle() {
        this.setIcon(new ImageIcon("src/BaseGame/Images/circle.png"));
        current = "circle";
    }
}
