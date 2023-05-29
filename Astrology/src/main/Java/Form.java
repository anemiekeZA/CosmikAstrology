package main.Java;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Form extends JFrame {
    public JPanel panelMain;
    private JTextField textName;
    private JButton button;
    private JTextField enterSName;
    private JLabel enterName;
    public JLabel birthdate;
    private JCheckBox spaghettiCheckBox;
    public JList yearList;
    private JList list1;
    public JList Day;
    public JLabel Month;

    public Form() {

        panelMain = new JPanel();
        this.setContentPane(this.panelMain);
        this.setTitle("title");
        this.setBounds(300, 400, 200, 400);
        this.setVisible(true);
        this.setDefaultCloseOperation(3);
        this.button = new JButton();
        this.button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(Form.this.button, Form.this.textName.getText() + ",Hello");
            }
        });
    }

    public static void main(String[] args) {
        Form form = new Form();
        form.setContentPane(form.panelMain);
        form.setTitle("title");
        form.setBounds(300, 400, 200, 400);
        form.setVisible(true);
        form.setDefaultCloseOperation(3);
    }

    public JFrame getFrame() {
        return this;
    }
}
