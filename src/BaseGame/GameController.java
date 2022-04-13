package BaseGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameController implements ActionListener {
    boolean player1turn;
    public GameController() {
        player1turn = true;
    }

    public void StartGame(MyFrame myFrame) {
        myFrame.setVisible(false);
    myFrame.setLayout(new GridLayout(3,3));

    GridButton buttonx1_y1= new GridButton();
        buttonx1_y1.addActionListener(this);
    GridButton buttonx1_y2 = new GridButton();
        buttonx1_y2.addActionListener(this);
    GridButton buttonx1_y3 = new GridButton();
        buttonx1_y3.addActionListener(this);
    GridButton buttonx2_y1 = new GridButton();
        buttonx2_y1.addActionListener(this);
    GridButton buttonx2_y2 = new GridButton();
        buttonx2_y2.addActionListener(this);
    GridButton buttonx2_y3 = new GridButton();
        buttonx2_y3.addActionListener(this);
    GridButton buttonx3_y1 = new GridButton();
        buttonx3_y1.addActionListener(this);
    GridButton buttonx3_y2 = new GridButton();
        buttonx3_y2.addActionListener(this);
    GridButton buttonx3_y3 = new GridButton();
        buttonx3_y3.addActionListener(this);

    myFrame.add(buttonx1_y1);
    myFrame.add(buttonx1_y2);
    myFrame.add(buttonx1_y3);
    myFrame.add(buttonx2_y1);
    myFrame.add(buttonx2_y2);
    myFrame.add(buttonx2_y3);
    myFrame.add(buttonx3_y1);
    myFrame.add(buttonx3_y2);
    myFrame.add(buttonx3_y3);

    myFrame.setVisible(true);

    UpdateGame();
    }

    public void UpdateGame() {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        GridButton pressedButton = (GridButton) e.getSource();
        if (player1turn) {
            pressedButton.setCircle();
            player1turn=!player1turn;
            pressedButton.removeActionListener(this);
        }else {
            pressedButton.setCross();
            player1turn=!player1turn;
            pressedButton.removeActionListener(this);
        }

    }
}
