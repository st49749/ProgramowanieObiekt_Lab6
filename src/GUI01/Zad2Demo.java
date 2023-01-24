package GUI01;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Zad2Demo extends JFrame {
    private JPanel mainPanel;
    private JTextField txtText;
    private JButton kopiujTextboxDoLabelButton;
    private JButton zamknijButton;
    private JLabel lblLabel;
    private JButton pokazPopupButton;

    public Zad2Demo() {
        // nie są to dokladnie te same aplikacje przedstawione w przykladach ale wykorzystuja wszystkie omawiane akcje
        super("Zadanie 2 Demo");
        this.setContentPane(this.mainPanel);
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        kopiujTextboxDoLabelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblLabel.setText(txtText.getText());
            }
        });

        zamknijButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        pokazPopupButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,new Date());
            }
        });
    }
}
