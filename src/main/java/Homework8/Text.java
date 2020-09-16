package Homework8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.channels.SeekableByteChannel;

public class Text extends JFrame {
    public Text() {
        setBounds(50,50,200,200);
        setTitle("Текстовое поле");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JTextField field = new JTextField();
        add(field);
        field.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Ваше сообщение: " + field.getText());
            }
        });
        setVisible(true);
    }

    public static void main(String[] args) {
        Text Text = new Text();
    }
}
