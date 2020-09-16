package Homework8;

import javax.swing.*;
import java.awt.*;

public class Button extends JFrame {
    public Button() {
        setTitle("Кнопка");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300,300,300,300);
        JButton[] jbs = new JButton[1];
        for (int i = 0; i < 1; i++) {
            jbs[i] = new JButton("#" + i);
        }
        setLayout(new BorderLayout());
        add(jbs[0], BorderLayout.CENTER);
        setVisible(true);
    }
}




