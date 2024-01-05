
import java.sql.*;

public class JBDCInsert {

    public static void main(String[] args) {
        try {
           String fname = "anjila";
           String lname="tripathi";
           String email="anjila.tripathi@gmail.com";
           String address ="kalanki";
            //load and register Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //Create Connction
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/Student", "root", "");
            //create statment 
            Statement state = conn.createStatement();
            //write query to create table
            String query = "Create table Information(id int(30) primary key auto_increment, fname varchar(30) not null, lname varchar(30) not null, email varchar(30) not null, address varchar(30) not null )";
           // Process result
           int result = state.executeUpdate(query);
           //write insert query
           String qry = "insert into Information(fname,lname,email,address) values (?,?,?,?)";
           //write preparedstatement
           PreparedStatement ps = conn.prepareStatement(qry);
           ps.setString(1,fname);
           ps.setString(2,lname);
           ps.setString(3,email);
           ps.setString(4,address);
           
           int results =ps.executeUpdate();
           
           //close
           ps.close();
           state.close();
           conn.close();
        
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }
}
