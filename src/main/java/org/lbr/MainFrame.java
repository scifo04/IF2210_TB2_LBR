package org.lbr;

import javax.swing.*;
import java.awt.*;

public class MainFrame {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame();
            frame.setSize(new Dimension(800, 800));
            frame.setLayout(new GridLayout());
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            MainWindow mainWindow = new MainWindow();
            mainWindow.initComponent();
            frame.add(mainWindow.mainPanel);
            frame.setVisible(true);
        });
    }
}
