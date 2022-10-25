/*
 * Created by JFormDesigner on Sat Jun 25 15:54:49 IRDT 2022
 */

package Pages;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author Mobina
 */
public class LoginPage extends JFrame {
    public LoginPage() {
        initComponents();
    }

    private void button2MouseClicked(MouseEvent e) {
        // TODO add your code here
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                LoginPage2 x = new LoginPage2();
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
        button3 = new JButton();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setText("Login as:");
        label1.setForeground(new Color(255, 204, 204));
        label1.setEnabled(false);
        label1.setFont(label1.getFont().deriveFont(label1.getFont().getSize() + 5f));
        contentPane.add(label1);
        label1.setBounds(45, 45, 125, 30);

        //---- button1 ----
        button1.setText("1.Seller");
        button1.setFont(button1.getFont().deriveFont(button1.getFont().getSize() + 4f));
        button1.setForeground(new Color(255, 153, 153));
        contentPane.add(button1);
        button1.setBounds(45, 90, 125, 30);

        //---- button2 ----
        button2.setText("2.Customer");
        button2.setFont(button2.getFont().deriveFont(button2.getFont().getSize() + 4f));
        button2.setForeground(new Color(255, 102, 102));
        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button2MouseClicked(e);
            }
        });
        contentPane.add(button2);
        button2.setBounds(45, 135, 125, 30);

        //---- button3 ----
        button3.setText("3.Admin");
        button3.setForeground(new Color(255, 51, 51));
        button3.setFont(button3.getFont().deriveFont(button3.getFont().getSize() + 4f));
        contentPane.add(button3);
        button3.setBounds(45, 180, 125, 30);

        contentPane.setPreferredSize(new Dimension(315, 300));
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Mobina
    private JLabel label1;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
