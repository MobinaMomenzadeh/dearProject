/*
 * Created by JFormDesigner on Sat Jun 25 10:37:05 IRDT 2022
 */

package Pages;

import Persons.Customer;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author Mobina
 */
public class CustomerRegister extends JFrame {


    private String name ;
    private String family;
    private String username ;
    private String password;
    private String email;
    private String phonenumber;
    private Double credit = 0.0;

    private void setNulll()
    {
        this.name = "null";
        this.family = "null";
        this.username = "null";
        this.password = "null";
        this.email = "null";
        this.phonenumber= "null";
        this.credit= 0.0;
    }

    public CustomerRegister() {
        initComponents();
    }

    private void textField1InputMethodTextChanged(InputMethodEvent e) {
        // TODO add your code here
    }

    private void textField1KeyTyped(KeyEvent e) {
        // TODO add your code here
    }

    private void textField1(ActionEvent e) {
        // TODO add your code here
        name = textField1.getText();
    }

    private void textField2(ActionEvent e) {
        // TODO add your code here
        family = textField2.getText();
    }

    private void textField3(ActionEvent e) {
        // TODO add your code here
        username = textField3.getText();
        System.out.println("khodara shokr");
    }

    private void passwordField1(ActionEvent e) {
        // TODO add your code here
        password = passwordField1.getText();

    }

    private void textField5(ActionEvent e) {
        // TODO add your code here
        email = textField5.getText();
    }

    private void textField6(ActionEvent e) {
        // TODO add your code here
        credit = Double.valueOf(textField6.getText());
        //textField6.requestFocus();
        System.out.println(credit);

    }

    private void textField7(ActionEvent e) {
        // TODO add your code here
        phonenumber = textField7.getText();
    }

    private void button1MouseClicked(MouseEvent e) {
        // TODO add your code here
        name = textField1.getText();
        family = textField2.getText();
        username = textField3.getText();
        password = passwordField1.getText();
        email = textField5.getText();
        phonenumber = textField7.getText();
        credit = new Double(textField6.getText());//String.valueOf(textField6.getText());
        new Customer(username,name,family,email,phonenumber,password,credit);
        setNulll();
    }











    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Mobina
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();
        label7 = new JLabel();
        textField1 = new JTextField();
        textField2 = new JTextField();
        textField3 = new JTextField();
        textField5 = new JTextField();
        textField6 = new JTextField();
        textField7 = new JTextField();
        button1 = new JButton();
        passwordField1 = new JPasswordField();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setText("Name:");
        label1.setForeground(new Color(0, 0, 102));
        label1.setFont(label1.getFont().deriveFont(label1.getFont().getSize() + 4f));
        contentPane.add(label1);
        label1.setBounds(45, 35, 100, 30);

        //---- label2 ----
        label2.setText("Family:");
        label2.setForeground(new Color(0, 0, 204));
        label2.setFont(label2.getFont().deriveFont(label2.getFont().getSize() + 4f));
        contentPane.add(label2);
        label2.setBounds(45, 75, 100, 30);

        //---- label3 ----
        label3.setText("Username:");
        label3.setIcon(null);
        label3.setForeground(new Color(0, 51, 255));
        label3.setFont(label3.getFont().deriveFont(label3.getFont().getSize() + 4f));
        contentPane.add(label3);
        label3.setBounds(45, 115, 100, 30);

        //---- label4 ----
        label4.setText("Password:");
        label4.setForeground(new Color(51, 51, 255));
        label4.setFont(label4.getFont().deriveFont(label4.getFont().getSize() + 4f));
        contentPane.add(label4);
        label4.setBounds(45, 155, 100, 30);

        //---- label5 ----
        label5.setText("Email:");
        label5.setForeground(new Color(102, 102, 255));
        label5.setFont(label5.getFont().deriveFont(label5.getFont().getSize() + 4f));
        contentPane.add(label5);
        label5.setBounds(45, 195, 100, 30);

        //---- label6 ----
        label6.setText("Credit:");
        label6.setForeground(new Color(204, 204, 255));
        label6.setFont(label6.getFont().deriveFont(label6.getFont().getSize() + 4f));
        contentPane.add(label6);
        label6.setBounds(45, 275, 100, 30);

        //---- label7 ----
        label7.setText("Phone number:");
        label7.setFont(label7.getFont().deriveFont(label7.getFont().getSize() + 4f));
        label7.setForeground(new Color(153, 153, 255));
        contentPane.add(label7);
        label7.setBounds(45, 235, 160, 30);

        //---- textField1 ----
        textField1.addActionListener(e -> textField1(e));
        contentPane.add(textField1);
        textField1.setBounds(180, 35, 100, 30);

        //---- textField2 ----
        textField2.addActionListener(e -> textField2(e));
        contentPane.add(textField2);
        textField2.setBounds(180, 75, 100, 30);

        //---- textField3 ----
        textField3.addActionListener(e -> textField3(e));
        contentPane.add(textField3);
        textField3.setBounds(180, 115, 100, 30);

        //---- textField5 ----
        textField5.addActionListener(e -> textField5(e));
        contentPane.add(textField5);
        textField5.setBounds(180, 195, 100, 30);

        //---- textField6 ----
        textField6.addActionListener(e -> textField6(e));
        contentPane.add(textField6);
        textField6.setBounds(180, 275, 100, 30);

        //---- textField7 ----
        textField7.addActionListener(e -> textField7(e));
        contentPane.add(textField7);
        textField7.setBounds(180, 235, 100, 30);

        //---- button1 ----
        button1.setText("Submit");
        button1.setFont(button1.getFont().deriveFont(button1.getFont().getSize() + 4f));
        button1.setForeground(new Color(255, 0, 204));
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button1MouseClicked(e);
            }
        });
        contentPane.add(button1);
        button1.setBounds(150, 360, 100, 50);

        //---- passwordField1 ----
        passwordField1.addActionListener(e -> passwordField1(e));
        contentPane.add(passwordField1);
        passwordField1.setBounds(180, 155, 100, 30);

        contentPane.setPreferredSize(new Dimension(400, 470));
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Mobina
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JButton button1;
    private JPasswordField passwordField1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
