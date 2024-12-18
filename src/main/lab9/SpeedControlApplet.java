package main.lab9;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SpeedControlApplet extends JPanel implements ActionListener {
    private int x = 50;
    private int speed = 5;
    private final int speedIncrement = 2;
    private Timer timer;

    public SpeedControlApplet() {
        JButton increaseSpeedButton = new JButton("Увеличить скорость");
        JButton decreaseSpeedButton = new JButton("Уменьшить скорость");

        increaseSpeedButton.addActionListener(this);
        decreaseSpeedButton.addActionListener(this);

        setLayout(new FlowLayout());
        add(increaseSpeedButton);
        add(decreaseSpeedButton);

        timer = new Timer(50, e -> {
            x += speed;
            if (x > getWidth()) {
                x = 0;
            }
            repaint();
        });
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillOval(x, 100, 20, 20);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Увеличить скорость")) {
            speed += speedIncrement;
        } else if (e.getActionCommand().equals("Уменьшить скорость")) {
            speed = Math.max(0, speed - speedIncrement);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Управление скоростью движения точки");
        SpeedControlApplet panel = new SpeedControlApplet();
        frame.add(panel);
        frame.setSize(800, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}