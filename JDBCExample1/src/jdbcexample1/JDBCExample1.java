
import java.sql.*;

public class JDBCExample1 {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/try", "root", "");
            Statement st = conn.createStatement();
            String query = "create table tabu(id int(30) primary key auto_increment, `name` varchar(30))";
            int i = st.executeUpdate(query);

            String s = "insert into tabu(`name`) values ('anjila')";
            PreparedStatement ps = conn.prepareStatement(s);
       
            int a = ps.executeUpdate();

            ps.close();
            st.close();
            conn.close();

        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }
}
