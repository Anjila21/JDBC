import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;
 public class MovieDb implements ActionListener
{
    JTextField t1,t2,t3,t4,t5;
    JLabel l1,l2,l3,l4,l5;
    JButton b1;
    MovieDb()
    {
        JFrame j = new JFrame("Movie Rental System");
        l1 = new JLabel("Id");
         l2 = new JLabel("Title");
          l3= new JLabel("Genre");
           l4 = new JLabel("Length");
            l5 = new JLabel("Language");
        t1 = new JTextField(10);
        t2 = new JTextField(10);
        t3 = new JTextField(10);
        t4 = new JTextField(10);
        t5 = new JTextField(10);
        b1 = new JButton("Submit");
        j.add(l1);
        j.add(t1);
        j.add(l2);
        j.add(t2);
        j.add(l3);
        j.add(t3);
        j.add(l4);
        j.add(t4);
        j.add(l5);
        j.add(t5);
        j.add(b1);
        j.setSize(500,500);
        j.setLayout(new FlowLayout());
        b1.addActionListener(this);
        j.setVisible(true);
        
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setLocationRelativeTo(null);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/movie","root","");
            System.out.println("Database Successfully Connection");
            String sql = "insert into movies(id,Title,Genre,Length,Language) values (?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1,1);
            ps.setString(2,t2.getText());
            ps.setString(3,t3.getText());
            ps.setInt(4,Integer.parseInt(t4.getText()));
            ps.setString(5,t5.getText());
            
            ps.executeUpdate();
            conn.close();
            System.out.println("Interested Successfully");        
        }
        catch(Exception ex)
        {
            System.out.println(ex.toString());
        }
    }
    public static void main(String[] args)
    {
        new MovieDb();
    }
}