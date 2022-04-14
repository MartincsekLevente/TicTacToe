package BaseGame;

import BaseGame.States.Ingame;
import BaseGame.States.MainMenu;

public class GameController {
    MyFrame myFrame = new MyFrame();
    MainMenu mainMenu = new MainMenu();
    Ingame inGame = new Ingame();;
    public void InitMenu() {

        myFrame.add(mainMenu);
        myFrame.setVisible(true);
        mainMenu.setGameController(this);
    }

    public void InitGame() {
        if (!inGame.whowon.equals("null")) {
            myFrame.remove(inGame);
            inGame = new Ingame();
        }
        myFrame.setVisible(false);
        myFrame.remove(mainMenu);
        myFrame.add(inGame);
        inGame.setGameController(this);
        myFrame.setVisible(true);
    }

    public void GameEnded() {
        myFrame.dispose();
    }

}
