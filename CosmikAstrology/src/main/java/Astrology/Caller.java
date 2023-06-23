package main.java.Astrology;
import main.java.Astrology.forms.Form;

import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Caller {
    public static void main(String[] args) {
//        Form obj = new Form()
        CallingFrame df = new CallingFrame();
    }
}

class CallingFrame extends JFrame{
    public CallingFrame(){
        //Creating Label
        JLabel welcomeMessage = new JLabel("Welcome find out your zodiac sign!");


        // Adding images
        JLabel welcomeImage = new JLabel();
        welcomeImage.setIcon(new ImageIcon("CosmikAstrology/src/main/java/Astrology/images/Aries.png"));
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
        setBounds(350,100,800,600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }


}
