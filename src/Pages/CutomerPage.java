/*
 * Created by JFormDesigner on Sat Jun 25 16:06:29 IRDT 2022
 */

package Pages;

import Persons.Customer;

import java.awt.*;
import javax.swing.*;

/**
 * @author Mobina
 */
public class CutomerPage extends JFrame {
    public CutomerPage(Customer a) {
        initComponents(a);
    }

    private void initComponents(Customer a) {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Mobina
        label1 = new JLabel();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        button6 = new JButton();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setFont(label1.getFont().deriveFont(label1.getFont().getSize() + 2f));
        label1.setForeground(new Color(0, 102, 102));
        label1.setText("kfldddsssdfl;ldkg;flkg");
        contentPane.add(label1);
        label1.setBounds(40, 30, 385, 150);

        //---- button1 ----
        button1.setText("1.edit  info");
        button1.setForeground(new Color(102, 102, 255));
        button1.setFont(button1.getFont().deriveFont(button1.getFont().getSize() + 3f));
        contentPane.add(button1);
        button1.setBounds(60, 200, 150, 30);

        //---- button2 ----
        button2.setText("3.shoping basket");
        button2.setForeground(new Color(102, 255, 102));
        button2.setFont(button2.getFont().deriveFont(button2.getFont().getSize() + 2f));
        contentPane.add(button2);
        button2.setBounds(60, 240, 150, 30);

        //---- button3 ----
        button3.setText("4.give point");
        button3.setFont(button3.getFont().deriveFont(button3.getFont().getSize() + 3f));
        button3.setForeground(new Color(255, 102, 102));
        contentPane.add(button3);
        button3.setBounds(60, 280, 150, 30);

        //---- button4 ----
        button4.setText("2.view product");
        button4.setFont(button4.getFont().deriveFont(button4.getFont().getSize() + 3f));
        button4.setForeground(new Color(204, 102, 255));
        contentPane.add(button4);
        button4.setBounds(260, 200, 150, 30);

        //---- button5 ----
        button5.setText("4.view buy records");
        button5.setForeground(new Color(0, 102, 51));
        button5.setFont(button5.getFont().deriveFont(button5.getFont().getSize() + 3f));
        contentPane.add(button5);
        button5.setBounds(260, 240, 150, 30);

        //---- button6 ----
        button6.setText("6.add view");
        button6.setFont(button6.getFont().deriveFont(button6.getFont().getSize() + 3f));
        button6.setForeground(new Color(102, 255, 204));
        contentPane.add(button6);
        button6.setBounds(260, 280, 150, 30);

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
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
