import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ItemListenerEx implements ItemListener
{
    JComboBox cb;
    JTextArea t;
    Container c;
    ItemListenerEx()
    {
        JFrame j = new JFrame("ItemListener Example");
        j.setSize(500,500);
        c= j.getContentPane();
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setLocationRelativeTo(null);
        
        String[] s = { "Nepal","India","Germany","Maldives"};
        cb = new JComboBox(s);
        cb.setBounds(100,200,100,50);
        c.add(cb);
        cb.addItemListener(this);

        t = new JTextArea();
        t.setBounds(160,200,100,100);
        c.add(t);
        
               j.setVisible(true);
        
        
    }
    
    public void itemStateChanged(ItemEvent e)
    {
       String s = cb.getSelectedItem().toString();
       t.setText(s);
    }
    public static void main(String[] args)
    {
        new ItemListenerEx();
    }
}