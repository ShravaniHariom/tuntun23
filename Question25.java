import java.awt.Color;

import javax.swing.*;
public class Question25{
    public static void main(String args[])
    {
        JFrame f = new JFrame();
        f.setSize(550,450);
        f.getContentPane().setBackground(Color.GRAY);

        JButton b1 = new JButton("All The Best");
        b1.setBounds(20, 10, 120, 50);
        b1.setForeground(Color.RED);
        f.add(b1);

        JButton b2 = new JButton("All The Best");
        b2.setBounds(145, 10, 120, 50);
        b2.setForeground(Color.PINK);
        f.add(b2);

        JButton b3 = new JButton("All The Best");
        b3.setBounds(270, 10, 120, 50);
        b3.setForeground(Color.BLUE);
        f.add(b3);

        JButton b4 = new JButton("All The Best");
        b4.setBounds(395, 10, 120, 50);
        b4.setForeground(Color.GREEN);
        f.add(b4);

        JButton b5 = new JButton("All The Best");
        b5.setBounds(200, 65, 120, 50);
        f.add(b5);
        b5.setForeground(Color.CYAN);

        JLabel l1 = new JLabel("All The Best");
        l1.setBounds(180, 120, 120, 50);
        f.add(l1);
        l1.setForeground(Color.PINK);

        JLabel l2 = new JLabel("All The Best");
        l2.setBounds(230, 200, 120, 50);
        f.add(l2);
        l2.setForeground(Color.CYAN);

        JLabel l3 = new JLabel("All The Best");
        l3.setBounds(320, 280, 120, 50);
        l3.setForeground(Color.RED);
        f.add(l3);

        JLabel l4 = new JLabel("All The Best");
        l4.setBounds(400, 360, 120, 50);
        l4.setForeground(Color.black);
        f.add(l4);


        f.setLayout(null);
        f.setVisible(true);

    }



}
