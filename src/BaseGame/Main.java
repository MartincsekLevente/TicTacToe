package BaseGame;

import javax.swing.*;

public class Main {



    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame();
        GameController gameController = new GameController();
        gameController.StartGame(myFrame);

    }





}
