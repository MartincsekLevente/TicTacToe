package BaseGame;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {


    public MyFrame() {
        this.setSize(800, 800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setTitle("Tic-Tac-Toe");

        //this.pack();
    }
}
