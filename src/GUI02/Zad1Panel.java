package GUI02;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Zad1Panel extends JFrame {
    private JPanel mainPanel;
    private JButton btnOk;
    private JTextField txtPassword;
    private JTextField txtSecondPass;

    public Zad1Panel() {
        super("Zadanie 1");
        this.setContentPane(this.mainPanel);
        this.setSize(500,250);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        btnOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!txtPassword.getText().equals(txtSecondPass.getText())) {
                    JOptionPane.showMessageDialog(null,"Passwords are not matched!");
                    return;
                }

                if(!txtPassword.getText().equals("codejava")) {
                    JOptionPane.showMessageDialog(null,"Wrong password!");
                    return;
                }

                JOptionPane.showMessageDialog(null,"Congratulations! You entered correct password.");
            }
        });
    }
}
