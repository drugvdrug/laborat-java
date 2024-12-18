package main.lab8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculateZ extends JFrame {

    private JTextField XField;
    private JTextField NField;
    private JTextField RField;
    private JTextField aField;
    private JLabel resultLabel;

    public CalculateZ() {
        super("Calculate Z");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(6, 2));

        add(new JLabel("X:"));
        XField = new JTextField();
        add(XField);

        add(new JLabel("N:"));
        NField = new JTextField();
        add(NField);

        add(new JLabel("R:"));
        RField = new JTextField();
        add(RField);

        add(new JLabel("a:"));
        aField = new JTextField();
        add(aField);

        JButton calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateZ();
            }
        });
        add(calculateButton);

        resultLabel = new JLabel();
        add(resultLabel);

        setVisible(true);
    }

    private void calculateZ() {
        double X = Double.parseDouble(XField.getText());
        int N = Integer.parseInt(NField.getText());
        int R = Integer.parseInt(RField.getText());
        double a = Double.parseDouble(aField.getText());

        double part1 = 0.0;
        int factorial = 1;
        for (int i = 1; i <= 4; i++) {
            factorial *= i;
            part1 += Math.pow(X, i) / factorial;
        }

        double part2 = 0.0;
        for (int i = 1; i <= N; ++i) {
            for (int j = 1; j <= R; ++j) {
                part2 += (a * i) / (Math.pow(i, 3) + Math.pow(j, 3));
            }
        }

        double Z = part1 + part2;

        resultLabel.setText("Z: " + Z);
    }

    public static void main(String[] args) {
        new CalculateZ();
    }
}