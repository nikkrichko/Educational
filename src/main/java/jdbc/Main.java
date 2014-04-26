package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Created by никита on 19.04.14.
 */
public class Main {
    public static void main(String[] args) {


        Connection conn = null;
        try
        {
            String userName = "yjrrdk";
            String password = "FF0716CD";
            String url ="jdbc:mysql://testdbi.cglpikxuecy6.us-west-2.rds.amazonaws.com:3306/yjrrdkDB";
            //// "jdbc:mysql://localhost/test";

            Class.forName ("com.mysql.jdbc.Driver").newInstance ();

            conn = DriverManager.getConnection(url, userName, password);


            System.out.println ("Database connection established");

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM test");



            while(rs.next()) {
                System.out.println(rs.getString(2));
            }
            System.out.println(rs);

        }
        catch (Exception e)
        {
            System.err.println ("Cannot connect to database server");
            e.printStackTrace();
        }
        finally
        {
            if (conn != null)
            {
                try
                {
                    conn.close ();
                    System.out.println ("Database connection terminated");
                }
                catch (Exception e) { }
            }
        }
    }
}
