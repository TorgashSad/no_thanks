package ru.antonyukav.no_thanks;

import javax.swing.*;
import java.awt.*;

public class Utils {

    public static void setDefaultJFrameSettings(JFrame jFrame) {
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setPreferredSize(new Dimension(1000, 500));
        BoxLayout boxLayout = new BoxLayout(jFrame.getContentPane(), BoxLayout.Y_AXIS);
        jFrame.getContentPane().setLayout(boxLayout);
    }

    public static void setDefaultJButtonSettings(JButton jButton) {
        jButton.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);
        jButton.setAlignmentY(java.awt.Component.CENTER_ALIGNMENT);
        jButton.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
        jButton.setPreferredSize(new Dimension(300, 300));
    }
}
