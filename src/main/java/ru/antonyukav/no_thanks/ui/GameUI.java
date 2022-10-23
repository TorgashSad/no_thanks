package ru.antonyukav.no_thanks.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameUI {

    @Autowired
    private MainMenu mainMenu;
    @Autowired
    private Settings settings;
    @Autowired
    private GameBoard gameBoard;

    public void start() {
        mainMenu.buildMainMenu(settings, gameBoard);
        settings.buildFrame(mainMenu);
        gameBoard.buildFrame(mainMenu);
        javax.swing.SwingUtilities.invokeLater(() -> mainMenu.showMainMenu());
    }
}
