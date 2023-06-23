package main.java.Astrology.forms;

import javax.swing.*;
import java.awt.*;
import javax.swing.JFrame;

public class ImageAdder extends JFrame {

    private JPanel contentPane;
    private JList list1;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {

            }
        });
        JFrame frame = new JFrame("Birth sign");

        frame.setSize(540, 960);

        frame.setResizable(true);
        frame.setLocationRelativeTo(null);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel();
        label.setIcon(new ImageIcon("CosmikAstrology/src/main/java/Astrology/images/Aries.png"));
        label.setHorizontalAlignment(SwingConstants.CENTER);

        frame.add(label);


        frame.setVisible(true);


    }

}