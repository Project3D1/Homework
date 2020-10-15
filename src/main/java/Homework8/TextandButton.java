package Homework8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextandButton extends JFrame implements ActionListener {

    JTextField field;
    JButton button;
    JLabel label1, label2;

    public TextandButton() {
        setSize(500,500);
        setTitle("Text and Button");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        JTextField field = new JTextField(10);
        JButton button = new JButton("Enter");
        JLabel label1 = new JLabel("Введите текст: ");
        JLabel label2 = new JLabel();

        add(label1);
        add(field);
        field.addActionListener(this);
        add(button);
        button.addActionListener(this);
        add(label2);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        label2.setText("Вы напечатали: " + field.getText());
    }

    public static void main(String[] args) {
        new TextandButton();
    }


}
