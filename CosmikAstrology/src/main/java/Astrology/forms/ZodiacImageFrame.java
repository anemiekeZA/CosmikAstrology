package main.java.Astrology.forms;

import javax.swing.*;

public class ZodiacImageFrame extends JFrame {
    public ZodiacImageFrame() {

        // Adding images
        JLabel welcomeImage = new JLabel();
        welcomeImage.setIcon(new ImageIcon("CosmikAstrology/src/main/java/Astrology/images/Aquarius.png"));
        welcomeImage.setHorizontalAlignment(SwingConstants.CENTER);
        JPanel ImagePanel = new JPanel();
        ImagePanel.add(welcomeImage);
        add(ImagePanel);
        setBounds(350,100,800,600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}