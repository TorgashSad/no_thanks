package ru.antonyukav.no_thanks.ui;

import lombok.Getter;
import org.springframework.stereotype.Component;
import ru.antonyukav.no_thanks.Utils;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

@Component
public class MainMenu {
    @Getter
    private final JFrame mainMenuJFrame;

    public MainMenu() {
        this.mainMenuJFrame = new JFrame("No, Thanks!");
    }

    public void showMainMenu() {
        mainMenuJFrame.pack();
        mainMenuJFrame.setVisible(true);
    }

    public void buildMainMenu(Settings settings, GameBoard gameBoard) {
        Utils.setDefaultJFrameSettings(mainMenuJFrame);
        Container pane = mainMenuJFrame.getContentPane();

        pane.add(getNoThanksLogo());
        pane.add(gameBoard.getButton(mainMenuJFrame));
        pane.add(settings.getButton(mainMenuJFrame));
    }

    public JButton getButton(JFrame originalMenu) {
        JButton menuButton = new JButton("Back to main menu");
        Utils.setDefaultJButtonSettings(menuButton);
        menuButton.addActionListener(e -> {
            originalMenu.setVisible(false);
            mainMenuJFrame.pack();
            mainMenuJFrame.setVisible(true);
        });
        return menuButton;
    }

    private static JLabel getNoThanksLogo() {
        BufferedImage noThanksLogo;
        try {
            noThanksLogo = ImageIO.read(new File("E:\\IntelliJ IDEA projects\\no_thanks\\src\\main\\resources\\nothanks-280x362.jpg"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        JLabel pic = new JLabel(new ImageIcon(noThanksLogo));
        pic.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);
        return pic;
    }
}
