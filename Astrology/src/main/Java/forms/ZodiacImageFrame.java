package main.Java.forms;

import main.Java.Form;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ZodiacImageFrame extends JFrame {

    public ZodiacImageFrame() {

        // Adding images
        JLabel welcomeImage = new JLabel();
        welcomeImage.setIcon(new ImageIcon("Astrology/src/main/Java/Images/CaWelcomePicture.jpeg"));
        welcomeImage.setHorizontalAlignment(SwingConstants.CENTER);
        JPanel ImagePanel = new JPanel();
        ImagePanel.add(welcomeImage);
        add(ImagePanel);
        setSize(800, 600); // google how to wrap a button
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        Form form = new Form();
        JPanel panelMain = new JPanel();
        form.setContentPane(form.panelMain);
        form.setTitle("title");
        form.setBounds(300, 400, 200, 400);
        form.setVisible(true);
        form.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}