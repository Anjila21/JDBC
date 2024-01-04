import java.sql.*;

public class JDBCExample {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); //load and register Driver
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/database", "root", "");
            Statement st = conn.createStatement();
            String qry = "Create table information(id int(15) primary key auto_increment, `name` varchar(20), email  varchar (30))";
            int rs = st.executeUpdate(qry);
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }
}
