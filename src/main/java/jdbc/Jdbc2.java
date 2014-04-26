package jdbc;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import java.sql.*;


/**
 * Created by никита on 19.04.14.
 */
public class Jdbc2 {
    public static void main(String[] args) {
        MysqlDataSource ds = new MysqlDataSource();
        ds.setURL("jdbc:mysql://testdbi.cglpikxuecy6.us-west-2.rds.amazonaws.com/yjrrdkDB");
        ds.setPort(3306);
        ds.setUser("yjrrdk");
        ds.setPassword("FF0716CD");
        Connection conn = null;


        try {
            conn = ds.getConnection();
            Statement statement =conn.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM test");


            conn.setAutoCommit(false);
            conn.commit();


            Savepoint svpt = conn.setSavepoint("first");
            conn.rollback(svpt);

            while(rs.next()) {
                System.out.print(rs.getInt(1));

                System.out.println(" " + rs.getString(2));

            }



        } catch (SQLException e) {
            e.printStackTrace();
            try {
                if (conn != null)
                    conn.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        }
        finally {
            try {
                if (conn != null)
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


    }
}
