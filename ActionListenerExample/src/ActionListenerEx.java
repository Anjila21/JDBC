
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ActionListenerEx implements ActionListener {

    JButton b1;
    Container c;

    ActionListenerEx() {
        JFrame j = new JFrame("Action Listener Example");
        j.setSize(500, 500);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setLocationRelativeTo(null);
        c = j.getContentPane();
        c.setLayout(null);
        b1 = new JButton("Click Me");
        b1.setBounds(100, 100, 200, 30);
        c.add(b1);

        b1.addActionListener(this);
        j.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        String str = b1.getText();
        b1.setText(str.toUpperCase());
    }

    public static void main(String[] args) {
        new ActionListenerEx();
    }
}
