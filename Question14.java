import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

public class Question14 {

    public static void main(String[] args) {
        JFrame f1= new JFrame();
        f1.setTitle("Swing Calculator");

        JTextField textField =new JTextField();
        textField.setBounds(60,50,300,50);
        textField.setText("");

        JPanel panel= new JPanel();
        panel.setLayout(new GridLayout(4,4));
        panel.setBounds(60,130,300,50);

        JButton b7=new JButton("7");
        b7.setBounds(60,150,100,40);
        panel.add(b7);
        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String exp=textField.getText();
                String exp2=exp.concat("7");
                textField.setText(exp2);
            }
        });

        JButton b8=new JButton("8");
        b8.setBounds(66,150,100,40);
        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String exp=textField.getText();
                String exp2=exp.concat("8");
                textField.setText(exp2);
            }
        });
        panel.add(b8);

        JButton b9=new JButton("9");
        b9.setBounds(72,150,100,40);
        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String exp=textField.getText();
                String exp2=exp.concat("9");
                textField.setText(exp2);
            }
        });
        panel.add(b9);

        JButton badd=new JButton("+");
        badd.setBounds(78,150,100,40);
        badd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              String field= textField.getText();
              String new1=field.concat("+");
              textField.setText(new1);
            }
        });
        panel.add(badd);

        JButton b4=new JButton("4");
        b4.setBounds(60,170,100,40);
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String exp=textField.getText();
                String exp2=exp.concat("4");
                textField.setText(exp2);
            }
        });
        panel.add(b4);

        JButton b5=new JButton("5");
        b5.setBounds(66,170,100,40);
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String exp=textField.getText();
                String exp2=exp.concat("5");
                textField.setText(exp2);
            }
        });
        panel.add(b5);

        JButton b6=new JButton("6");
        b6.setBounds(72,170,100,40);
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String exp=textField.getText();
                String exp2=exp.concat("6");
                textField.setText(exp2);
            }
        });
        panel.add(b6);

        JButton bsub=new JButton("-");
        bsub.setBounds(78,170,100,40);
        panel.add(bsub);

        JButton b1=new JButton("1");
        b1.setBounds(60,190,100,40);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String exp=textField.getText();
                String exp2=exp.concat("1");
                textField.setText(exp2);
            }
        });

        panel.add(b1);

        JButton b2=new JButton("2");
        b2.setBounds(66,170,100,40);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String exp=textField.getText();
                String exp2=exp.concat("2");
                textField.setText(exp2);
            }
        });
        panel.add(b2);

        JButton b3=new JButton("3");
        b3.setBounds(72,170,100,40);
        panel.add(b3);
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String exp=textField.getText();
                String exp2=exp.concat("3");
                textField.setText(exp2);
            }
        });

        JButton bmul=new JButton("*");
        bmul.setBounds(78,170,100,40);
        panel.add(bmul);

        JButton bcancel=new JButton("C");
        bcancel.setBounds(60,190,100,40);
        bcancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("");
            }
        });
        panel.add(bcancel);

        JButton b0=new JButton("0");
        b0.setBounds(66,170,100,40);
        b0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String exp=textField.getText();
                String exp2=exp.concat("0");
                textField.setText(exp2);
            }
        });
        panel.add(b0);

        JButton bequals=new JButton("=");
        bequals.setBounds(72,170,100,40);
        panel.add(bequals);
        bequals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              String Expression= textField.getText();

              if (Expression.contains("+")){
                  String newexp1=Expression.replace("+"," ");
                  String[] newexp=newexp1.split(" ");
                  int size=newexp.length;
                  int arrayofnewxexp[]=new int[size];
                  int sum=0;
                  for (int i=0;i<size;i++){
                      arrayofnewxexp[i]=Integer.parseInt(newexp[i]);
                  }
                  for (int i=0;i<size;i++){
                      sum=sum+arrayofnewxexp[i];
                  }
                 textField.setText(String.valueOf(sum));
              }

            }
        });

        JButton bdiv=new JButton("/");
        bdiv.setBounds(78,170,100,40);
        panel.add(bdiv);

        f1.setVisible(true);
        f1.add(textField,BorderLayout.NORTH);
        f1.add(panel);
        f1.setLayout(null);
        f1.setSize(500,500);
    }
}
