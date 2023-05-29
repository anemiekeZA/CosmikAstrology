package main.Java;

import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CallingFrame extends JFrame{

    public class Caller {
        public static void main(String[] args) {
            Form obj = new Form();
            CallingFrame df = new CallingFrame();
        }
    }

    public CallingFrame(){
        //Creating Label
        JLabel welcomeMessage = new JLabel("Welcome this program allows you to find out your zodiac sign!");


        // Adding images
        JLabel welcomeImage = new JLabel();
        welcomeImage.setIcon(new ImageIcon("Astrology/src/main/Java/Images/CaWelcomePicture.jpeg"));
        welcomeImage.setHorizontalAlignment(SwingConstants.CENTER);
        JPanel ImagePanel = new JPanel();
        ImagePanel.add(welcomeImage);
        add(ImagePanel);


        // Adding a button
        JButton button = new JButton("Welcome!");
        button.setBounds(350, 300, 100, 50);
        add(button);

        // adding button click event
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Form();
                dispose();
            }
        });

        JPanel panel = new JPanel();
        panel.add(welcomeMessage);
        add(panel);
        add(ImagePanel);
        setSize(800,600); // google how to wrap a button
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
