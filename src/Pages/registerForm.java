/*
 * Created by JFormDesigner on Sat Jun 25 09:33:39 IRDT 2022
 */

package Pages;

import Persons.Customer;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author Mobina
 */
public class registerForm extends JFrame {
    public registerForm() {
        initComponents();
    }

    private void button2MouseClicked(MouseEvent e) {
        // TODO add your code here
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                CustomerRegister x = new CustomerRegister();
                x.setVisible(true);
            }
        });
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Mobina
        button1 = new JButton();
        label1 = new JLabel();
        button2 = new JButton();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- button1 ----
        button1.setText("1.Seller");
        button1.setForeground(new Color(0, 102, 102));
        button1.setFont(button1.getFont().deriveFont(button1.getFont().getSize() + 2f));
        contentPane.add(button1);
        button1.setBounds(45, 100, 150, button1.getPreferredSize().height);

        //---- label1 ----
        label1.setForeground(new Color(0, 51, 51));
        label1.setText("register as:");
        label1.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        contentPane.add(label1);
        label1.setBounds(45, 40, 150, 45);

        //---- button2 ----
        button2.setText("2.Cutomer");
        button2.setFont(button2.getFont().deriveFont(button2.getFont().getSize() + 2f));
        button2.setForeground(new Color(0, 153, 153));
        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button2MouseClicked(e);
            }
        });
        contentPane.add(button2);
        button2.setBounds(45, 145, 150, button2.getPreferredSize().height);

        contentPane.setPreferredSize(new Dimension(300, 340));
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Mobina
    private JButton button1;
    private JLabel label1;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
