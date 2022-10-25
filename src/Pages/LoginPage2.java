/*
 * Created by JFormDesigner on Sat Jun 25 16:14:31 IRDT 2022
 */

package Pages;

import Persons.Customer;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author Mobina
 */
public class LoginPage2 extends JFrame {
    public LoginPage2() {
        initComponents();
    }

    private void button1MouseClicked(MouseEvent e) {
        // TODO add your code here
        String user = textField1.getText();
        String pass = textField2.getText();
        Customer dearCustomer = new Customer("nan");
        for (Customer a : Persons.Customer.allCustomers)
            if (a.getUserName().equals(pass) && a.getPassword().equals(user)) {
                dearCustomer = a;
            }
        Customer finalDearCustomer = dearCustomer;
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                CutomerPage x = new CutomerPage(finalDearCustomer);
                x.setVisible(true);
            }
        });


    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Mobina
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        textField1 = new JTextField();
        textField2 = new JTextField();
        button1 = new JButton();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setText("Enter User and Password:");
        label1.setForeground(new Color(102, 102, 0));
        label1.setFont(label1.getFont().deriveFont(label1.getFont().getSize() + 5f));
        contentPane.add(label1);
        label1.setBounds(45, 45, 300, 30);

        //---- label2 ----
        label2.setText("User:");
        label2.setForeground(new Color(153, 153, 0));
        label2.setFont(label2.getFont().deriveFont(label2.getFont().getSize() + 4f));
        contentPane.add(label2);
        label2.setBounds(45, 90, 100, 30);

        //---- label3 ----
        label3.setText("Password:");
        label3.setForeground(new Color(204, 204, 0));
        label3.setFont(label3.getFont().deriveFont(label3.getFont().getSize() + 4f));
        contentPane.add(label3);
        label3.setBounds(45, 135, 100, 30);
        contentPane.add(textField1);
        textField1.setBounds(150, 90, 100, 30);
        contentPane.add(textField2);
        textField2.setBounds(150, 135, 100, 30);

        //---- button1 ----
        button1.setText("Submit");
        button1.setFont(button1.getFont().deriveFont(button1.getFont().getSize() + 4f));
        button1.setForeground(new Color(255, 204, 0));
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button1MouseClicked(e);
            }
        });
        contentPane.add(button1);
        button1.setBounds(105, 195, 100, 30);

        {
            // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < contentPane.getComponentCount(); i++) {
                Rectangle bounds = contentPane.getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = contentPane.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            contentPane.setMinimumSize(preferredSize);
            contentPane.setPreferredSize(preferredSize);
        }
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Mobina
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JTextField textField1;
    private JTextField textField2;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
