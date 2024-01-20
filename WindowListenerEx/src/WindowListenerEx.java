import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WindowListenerEx implements WindowListener
{
    Container c;
    
    WindowListenerEx()
    {
        JFrame f = new JFrame("Window Example");
        c = f.getContentPane();
        f.setSize(500,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.addWindowListener(this);
        f.setVisible(true);
        
        
    }
     public void windowActivated(WindowEvent e)
     {
         System.out.println("Window Activated");
     }
     public void windowDeactivated (WindowEvent e)
     {
         System.out.println("Window Deactivated");
     }
     public void windowOpened (WindowEvent e)
     {
         System.out.println("Window Opened");
     }
     public void windowClosed (WindowEvent e)
     {
         System.out.println("Window Closed");
     }
     public void windowClosing (WindowEvent e)
     {
         System.out.println("Window Closing");
     }
     public void windowDeiconified( WindowEvent e)
     {
         System.out.println("Window Deconfied");
     }
     public void windowIconified( WindowEvent e)
     {
         System.out.println("Window Iconfied");
     }
     public static void main(String[] ags)
     {
         new WindowListenerEx();
     }
}