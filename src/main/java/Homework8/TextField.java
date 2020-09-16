package Homework8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextField implements ActionListener {
    JTextField jtf;
    JButton jbtnRev;
    JLabel jlabPrompt, jlabContents;

    TextField() {
        JFrame jfrm = new JFrame("Use a Text Field");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(240, 120);
        jfrm.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jtf = new JTextField(10);
        jtf.setActionCommand("MyTF");
        JButton jbtnRev = new JButton("Enter");
        jtf.addActionListener(this);
        jbtnRev.addActionListener(this);

        jlabPrompt = new JLabel("Enter text: ");
        jlabContents = new JLabel("");

        jfrm.add(jlabPrompt);
        jfrm.add(jtf);
        jfrm.add(jbtnRev);
        jfrm.add(jlabContents);

        jfrm.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Reverse")) {
            String orgStr = jtf.getText();
            String resStr = "";

            for (int i = orgStr.length() - 1; i >= 0; i--)
                resStr += orgStr.charAt(i);

            jtf.setText(resStr);
        } else
            jlabContents.setText("You pressed Enter. Text is: " + jtf.getText());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TextField();
            }
        });
    }
}
