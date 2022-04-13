package BaseGame.States;

import BaseGame.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ingame extends JLabel implements ActionListener {
    boolean player1turn;
    String whowon;
    GameController gameController;
    GridButton buttonx1_y1;
    GridButton buttonx1_y2;
    GridButton buttonx1_y3;
    GridButton buttonx2_y1;
    GridButton buttonx2_y2;
    GridButton buttonx2_y3;
    GridButton buttonx3_y1;
    GridButton buttonx3_y2;
    GridButton buttonx3_y3;


    public Ingame() {
        buttonx1_y1 = new GridButton();
        buttonx1_y1.addActionListener(this);
        buttonx1_y2 = new GridButton();
        buttonx1_y2.addActionListener(this);
        buttonx1_y3 = new GridButton();
        buttonx1_y3.addActionListener(this);
        buttonx2_y1 = new GridButton();
        buttonx2_y1.addActionListener(this);
        buttonx2_y2 = new GridButton();
        buttonx2_y2.addActionListener(this);
        buttonx2_y3 = new GridButton();
        buttonx2_y3.addActionListener(this);
        buttonx3_y1 = new GridButton();
        buttonx3_y1.addActionListener(this);
        buttonx3_y2 = new GridButton();
        buttonx3_y2.addActionListener(this);
        buttonx3_y3 = new GridButton();
        buttonx3_y3.addActionListener(this);
        this.setText("MainMenu");
        player1turn = true;
        StartGame();
    }

    public void setGameController(GameController gameController) {
        this.gameController = gameController;
    }


    public void StartGame() {
        this.setLayout(new GridLayout(3, 3));
        this.add(buttonx1_y1);
        this.add(buttonx1_y2);
        this.add(buttonx1_y3);
        this.add(buttonx2_y1);
        this.add(buttonx2_y2);
        this.add(buttonx2_y3);
        this.add(buttonx3_y1);
        this.add(buttonx3_y2);
        this.add(buttonx3_y3);
    }

    public void UpdateGame() {
        if (buttonx1_y1.current.equals("circle") && buttonx1_y2.current.equals("circle") && buttonx1_y3.current.equals("circle")) { //first row circle
            whowon = "player1";
            endGame();
        } else if (buttonx1_y1.current.equals("cross") && buttonx1_y2.current.equals("cross") && buttonx1_y3.current.equals("cross")) { //first row cross
            whowon = "player2";
            endGame();
        } else if (buttonx2_y1.current.equals("circle") && buttonx2_y2.current.equals("circle") && buttonx2_y3.current.equals("circle")) { //second row circle
            whowon = "player1";
            endGame();
        } else if (buttonx2_y1.current.equals("cross") && buttonx2_y2.current.equals("cross") && buttonx2_y3.current.equals("cross")) { //second row circle
            whowon = "player2";
            endGame();
        } else if (buttonx3_y1.current.equals("circle") && buttonx3_y2.current.equals("circle") && buttonx3_y3.current.equals("circle")) { //third row circle
            whowon = "player1";
            endGame();
        } else if (buttonx3_y1.current.equals("cross") && buttonx3_y2.current.equals("cross") && buttonx3_y3.current.equals("cross")) { //third row circle
            whowon = "player2";
            endGame();
        } else if (buttonx1_y1.current.equals("circle") && buttonx2_y1.current.equals("circle") && buttonx3_y1.current.equals("circle")) { //first column circle
            whowon = "player1";
            endGame();
        } else if (buttonx1_y1.current.equals("cross") && buttonx2_y1.current.equals("cross") && buttonx3_y1.current.equals("cross")) { //first column cross
            whowon = "player2";
            endGame();
        } else if (buttonx1_y2.current.equals("circle") && buttonx2_y2.current.equals("circle") && buttonx3_y2.current.equals("circle")) { //second column circle
            whowon = "player1";
            endGame();
        } else if (buttonx1_y2.current.equals("cross") && buttonx2_y2.current.equals("cross") && buttonx3_y2.current.equals("cross")) { //second column cross
            whowon = "player2";
            endGame();
        } else if (buttonx1_y3.current.equals("circle") && buttonx2_y3.current.equals("circle") && buttonx3_y3.current.equals("circle")) { //third column circle
            whowon = "player1";
            endGame();
        } else if (buttonx1_y3.current.equals("cross") && buttonx2_y3.current.equals("cross") && buttonx3_y3.current.equals("cross")) { //third column cross
            whowon = "player2";
            endGame();
        } else if (buttonx1_y1.current.equals("cross") && buttonx2_y2.current.equals("cross") && buttonx3_y3.current.equals("cross")) { //left diagonal cross
            whowon = "player2";
            endGame();
        } else if (buttonx1_y1.current.equals("circle") && buttonx2_y2.current.equals("circle") && buttonx3_y3.current.equals("circle")) { //left diagonal circle
            whowon = "player1";
            endGame();
        } else if (buttonx1_y3.current.equals("cross") && buttonx2_y2.current.equals("cross") && buttonx3_y1.current.equals("cross")) { //right diagonal cross
            whowon = "player2";
            endGame();
        } else if (buttonx1_y3.current.equals("circle") && buttonx2_y2.current.equals("circle") && buttonx3_y1.current.equals("circle")) { //right diagonal circle
            whowon = "player1";
            endGame();
        } else if (!buttonx1_y1.current.equals("null") && !buttonx1_y2.current.equals("null") && !buttonx1_y3.current.equals("null")
                && !buttonx2_y1.current.equals("null") && !buttonx2_y2.current.equals("null") && !buttonx2_y3.current.equals("null")
                && !buttonx3_y1.current.equals("null") && !buttonx3_y2.current.equals("null") && !buttonx3_y3.current.equals("null")) {
            whowon = "draw";
            endGame();
        }

    }

    public void endGame() {
        if (whowon.equals("player1")) {
            JOptionPane.showMessageDialog(this, "Player 1 has won the game!", "Congratulations!",JOptionPane.WARNING_MESSAGE);
            gameController.GameEnded();
        } else if (whowon.equals("player2")) {
            JOptionPane.showMessageDialog(this, "Player 2 has won the game!", "Congratulations!", JOptionPane.WARNING_MESSAGE);
            gameController.GameEnded();
        } else {
            JOptionPane.showMessageDialog(this, "Draw! There is no winner!", "Game Over", JOptionPane.WARNING_MESSAGE);
            gameController.GameEnded();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        GridButton pressedButton = (GridButton) e.getSource();
        if (player1turn) {
            pressedButton.setCircle();
        } else {
            pressedButton.setCross();
        }
        player1turn = !player1turn;
        pressedButton.removeActionListener(this);
        UpdateGame();
    }
}
