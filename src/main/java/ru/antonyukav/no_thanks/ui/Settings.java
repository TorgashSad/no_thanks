package ru.antonyukav.no_thanks.ui;

import org.springframework.stereotype.Component;
import ru.antonyukav.no_thanks.Utils;

import javax.swing.*;
import java.awt.*;

@Component
public class Settings {
    private final JFrame settingsJFrame;

    public Settings() {
        this.settingsJFrame = new JFrame("No, Thanks! settings");
    }

    public void buildFrame(MainMenu mainMenu) {
        Utils.setDefaultJFrameSettings(settingsJFrame);
        Container pane = settingsJFrame.getContentPane();

        pane.add(mainMenu.getButton(settingsJFrame));
    }

    public JButton getButton(JFrame mainMenuFrame) {
        JButton settingsButton = new JButton("Settings");
        Utils.setDefaultJButtonSettings(settingsButton);
        settingsButton.addActionListener(e -> {
            mainMenuFrame.setVisible(false);
            settingsJFrame.pack();
            settingsJFrame.setVisible(true);
        });
        return settingsButton;
    }

}
