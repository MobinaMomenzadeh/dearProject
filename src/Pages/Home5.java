/*
 * Created by JFormDesigner on Fri Jun 24 20:55:51 IRDT 2022
 */

package Pages;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author Mobina
 */
public class Home5 extends JFrame {
    public Home5() {
        initComponents();
    }

    private void button1KeyPressed(KeyEvent e) {
        // TODO add your code here
        System.out.println("yeeeeeeeeesss");
    }

    private void button1MouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void button2MouseClicked(MouseEvent e) {
        // TODO add your code here
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                register x = new register();
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
        setTitle("Homepage");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setText("Welcome! select :");
        label1.setBackground(new Color(51, 204, 255));
        label1.setFont(label1.getFont().deriveFont(label1.getFont().getSize() + 4f));
        label1.setForeground(new Color(255, 51, 204));
        contentPane.add(label1);
        label1.setBounds(45, 35, 165, 50);

        //---- button1 ----
        button1.setText("1.View products");
        button1.setForeground(new Color(102, 102, 255));
        button1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button1MouseClicked(e);
            }
        });
        contentPane.add(button1);
        button1.setBounds(45, 100, 195, button1.getPreferredSize().height);

        //---- button2 ----
        button2.setText("2.login and register");
        button2.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
        button2.setForeground(new Color(0, 102, 255));
        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button2MouseClicked(e);
            }
        });
        contentPane.add(button2);
        button2.setBounds(45, 160, 195, button2.getPreferredSize().height);

        contentPane.setPreferredSize(new Dimension(285, 305));
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
