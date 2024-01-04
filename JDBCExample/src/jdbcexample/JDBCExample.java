
public class JDBCExample {

    public static void main(String[] args)  throws Exception
    {

        Class.forName("com.mysql.cj.jdbc.Drivers"); //load and register Driver
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost=3306", "root", "");
        Statement st = conn.getStatement();
        Resultset rs = st.executeUpdate();
        conn.close;
    }
}
