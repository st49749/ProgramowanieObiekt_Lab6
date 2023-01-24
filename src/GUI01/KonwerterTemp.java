package GUI01;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KonwerterTemp extends JFrame {

    private JTextField txtCelcTemp;
    private JLabel lblCalcResult;
    private JButton btnKonwertuj;
    private JPanel mainPanel;

    public KonwerterTemp() {
        super("Konwerter temparatury");
        this.setContentPane(this.mainPanel);
        this.setSize(500,200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btnKonwertuj.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    var text = txtCelcTemp.getText();
                    double c = Double.parseDouble(text);
                    var result = c * 1.8 + 32;
                    lblCalcResult.setText(Double.toString(result));
                }
                catch (Exception ex) {
                    JOptionPane.showMessageDialog(null,"Wystapil blad: " + ex.getMessage());
                }
            }
        });
    }
}
