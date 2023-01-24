package GUI02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Zad2Demo extends JFrame {
    private JPanel mainPanel;
    private JButton loginButton;
    private JTextField txtUserName;
    private JTextField txtPassword;
    private JLabel lblLogin;
    private JRadioButton linuxRadioButton;
    private JRadioButton windowsRadioButton;
    private JRadioButton macintoshRadioButton;
    private JLabel iconJLabel;
    private JButton okButton;
    private JButton okButton1;
    private JCheckBox java3500CheckBox;
    private JCheckBox c4000CheckBox;
    private JCheckBox c3000CheckBox;
    private JCheckBox python5000CheckBox;

    private ImageIcon iconLinux = new ImageIcon(getClass().getResource("Linux.png"));
    private ImageIcon iconWin = new ImageIcon(getClass().getResource("Windows.png"));
    private ImageIcon iconMac = new ImageIcon(getClass().getResource("Apple.png"));

    public Zad2Demo() {
        super("Zad 2 demo");
        this.setContentPane(this.mainPanel);
        this.setSize(500,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                var text = "Username: " + txtUserName.getText() + " Password: " + txtPassword.getText();
                lblLogin.setText(text);
            }
        });

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(linuxRadioButton);
        buttonGroup.add(windowsRadioButton);
        buttonGroup.add(macintoshRadioButton);

        linuxRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(linuxRadioButton.isSelected()){
                    iconJLabel.setIcon(resize(iconLinux,120,120));
                }
            }
        });

        windowsRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(windowsRadioButton.isSelected()){
                    iconJLabel.setIcon(resize(iconWin,200,120));
                }
            }
        });

        macintoshRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(macintoshRadioButton.isSelected()){
                    iconJLabel.setIcon(resize(iconMac,120,120));
                }
            }
        });

        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                var text = "";
                if (linuxRadioButton.isSelected()){
                    text = "Linux";
                }
                if (windowsRadioButton.isSelected()){
                    text = "Windows";
                }
                if (macintoshRadioButton.isSelected()){
                    text = "Macintosh";
                }

                JOptionPane.showMessageDialog(null,"You selected: " + text);
            }
        });

        okButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                var text = "";
                double cena = 0;
                if (java3500CheckBox.isSelected()){
                    text += java3500CheckBox.getText() + "\n";
                    cena += 3500;
                }
                if (c3000CheckBox.isSelected()){
                    text += c3000CheckBox.getText() + "\n";
                    cena += 3000;
                }
                if (c4000CheckBox.isSelected()){
                    text += c4000CheckBox.getText() + "\n";
                    cena += 4000;
                }
                if (python5000CheckBox.isSelected()){
                    text += python5000CheckBox.getText() + "\n";
                    cena += 5000;
                }

                text += "--------------------------\n";
                text += "Cena: " + cena;

                JOptionPane.showMessageDialog(null,text);
            }
        });
    }

    public static ImageIcon resize(ImageIcon src, int destWidth, int destHeight){
        return new ImageIcon(src.getImage().getScaledInstance(destWidth,destHeight, Image.SCALE_SMOOTH));
    }
}
