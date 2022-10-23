package ru.antonyukav.no_thanks.ui;

import org.springframework.stereotype.Component;
import ru.antonyukav.no_thanks.Utils;

import javax.swing.*;
import java.awt.*;

@Component
public class GameBoard {

    private final JFrame gameBoardJFrame;

    public GameBoard() {
        gameBoardJFrame = new JFrame("No, Thanks! gameboard");
    }

    public void buildFrame(MainMenu mainMenu) {
        Utils.setDefaultJFrameSettings(gameBoardJFrame);
        Container pane = gameBoardJFrame.getContentPane();

        pane.add(mainMenu.getButton(gameBoardJFrame));
    }

    public JButton getButton(JFrame initialMenu) {
        JButton startButton = new JButton("Start!");
        Utils.setDefaultJButtonSettings(startButton);
        startButton.addActionListener(e -> {
            initialMenu.setVisible(false);
            gameBoardJFrame.pack();
            gameBoardJFrame.setVisible(true);
        });
        return startButton;
    }
}
