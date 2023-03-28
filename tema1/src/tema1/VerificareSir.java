package tema1;

import javax.swing.*;
import java.awt.*;

public class VerificareSir extends JFrame {

    private JTextField patternTextField, stringTextField;
    private JLabel patternLabel, stringLabel, resultLabel;
    private JButton verifyButton;

    public VerificareSir() {
        setTitle("Verificare Sir");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        patternLabel = new JLabel("Pattern:");
        patternTextField = new JTextField();
        stringLabel = new JLabel("Sir:");
        stringTextField = new JTextField();
        resultLabel = new JLabel();
        verifyButton = new JButton("Verifica");
        verifyButton.addActionListener(e -> verifyString());

        JPanel panel = new JPanel(new GridLayout(3, 2));
        panel.add(patternLabel);
        panel.add(patternTextField);
        panel.add(stringLabel);
        panel.add(stringTextField);
        panel.add(resultLabel);
        panel.add(verifyButton);
        add(panel);
    }

    private void verifyString() {
        String pattern = patternTextField.getText();
        String string = stringTextField.getText();
        boolean match = string.matches(pattern);
        resultLabel.setText(match ? "Sirul respecta patternul." : "Sirul nu respecta paternul.");
    }

    public static void main(String[] args) {
        VerificareSir app = new VerificareSir();
        app.setVisible(true);
    }
}
