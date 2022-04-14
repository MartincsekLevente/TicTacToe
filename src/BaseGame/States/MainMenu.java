package BaseGame.States;

import BaseGame.GameController;
import BaseGame.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends JLabel implements ActionListener {
    ImageIcon mainlogo = new ImageIcon("src/BaseGame/Images/mainmenulogo.png");
    JButton playButton = new JButton();
    GameController gameController;

    public MainMenu() {

        playButton.setBounds(288, 600, 200, 70);
        playButton.setFocusable(false);
        playButton.setHorizontalTextPosition(JButton.CENTER);
        playButton.setVerticalTextPosition(JButton.CENTER);
        playButton.setFont(new Font("MV Boli", Font.BOLD, 25));
        playButton.setForeground(new Color(60, 63, 65));
        playButton.setText("Start Game");
        playButton.setBorder(BorderFactory.createLineBorder(new Color(152, 0, 1), 3));
        playButton.setBackground(Color.PINK);
        playButton.addActionListener(this);

        this.setIcon(mainlogo);
        this.setHorizontalAlignment(JLabel.CENTER);
        this.setVerticalAlignment(JLabel.CENTER);
        this.setBackground(Color.CYAN);
        this.add(playButton);
        this.setOpaque(true);

    }

    public void setGameController(GameController gameController) {
        this.gameController = gameController;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        gameController.InitGame();
    }
}
