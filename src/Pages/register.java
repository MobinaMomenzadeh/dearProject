/*
 * Created by JFormDesigner on Sat Jun 25 09:25:47 IRDT 2022
 */

package Pages;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author Mobina
 */
public class register extends JFrame {
    public register() {
        initComponents();
    }

    private void button1MouseClicked(MouseEvent e) {
        // TODO add your code here
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                registerForm x = new registerForm();
                x.setVisible(true);
            }
        });
    }

    private void button2MouseClicked(MouseEvent e) {
        // TODO add your code here
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                LoginPage x = new LoginPage();
                x.setVisible(true);
            }
        });
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Mobina
        label1 = new JLabel();
        button1 = new JButton();
        button2 = new JButton();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setText("What do you want to do?");
        label1.setFont(label1.getFont().deriveFont(label1.getFont().getSize() + 5f));
        label1.setForeground(Color.black);
        contentPane.add(label1);
        label1.setBounds(45, 40, 250, 30);

        //---- button1 ----
        button1.setText("1.register");
        button1.setForeground(new Color(51, 51, 51));
        button1.setFont(button1.getFont().deriveFont(button1.getFont().getSize() + 4f));
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button1MouseClicked(e);
            }
        });
        contentPane.add(button1);
        button1.setBounds(45, 90, 115, button1.getPreferredSize().height);

        //---- button2 ----
        button2.setText("2.login");
        button2.setFont(button2.getFont().deriveFont(button2.getFont().getSize() + 4f));
        button2.setForeground(new Color(102, 102, 102));
        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button2MouseClicked(e);
            }
        });
        contentPane.add(button2);
        button2.setBounds(45, 140, 115, button2.getPreferredSize().height);

        contentPane.setPreferredSize(new Dimension(330, 300));
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Mobina
    private JLabel label1;
    private JButton button1;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
