package BaseGame;

import javax.swing.*;

public class Main {



    public static void main(String[] args) {

        GameController gameController = new GameController();
        MyFrame myFrame = new MyFrame();
        gameController.StartGame(myFrame);

    }





}
