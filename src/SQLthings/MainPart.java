package SQLthings;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class MainPart
{
    public static String url = "jdbc:mysql://localhost/project";
    public static String username = "root";
    public static String pass = "1234";

    public static void runExecute(String x) throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,username,pass);

        Statement st = con.prepareStatement(x);
        st.execute(x);

        con.close();
    }


}