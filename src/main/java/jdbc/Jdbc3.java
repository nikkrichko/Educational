package jdbc;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import com.sun.rowset.CachedRowSetImpl;

import javax.sql.rowset.CachedRowSet;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by никита on 21.04.14.
 */
public class Jdbc3 {
    public static void main(String[] args) {
        Settings settings = new SettingsReader();
        MysqlDataSource ds = new MysqlDataSource();
        ds.setURL(settings.getURL());
        ds.setPort(settings.getPort());
        ds.setUser(settings.getName());
        ds.setPassword(settings.getPassword());

        Connection connection = null;

        try {
            connection = ds.getConnection();
            connection.setAutoCommit(false);



        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            CachedRowSet cachedRowSet = new CachedRowSetImpl();
//            cachedRowSet.setUrl("jdbc:mysql://testdbi.cglpikxuecy6.us-west-2.rds.amazonaws.com:3306/yjrrdkDB");
//            cachedRowSet.setUsername(settings.getName());
//            cachedRowSet.setPassword(settings.getPassword());
            cachedRowSet.setCommand("SELECT * FROM test");
            cachedRowSet.execute(connection);
            while (cachedRowSet.next()){
                System.out.print(cachedRowSet.getString(1) + " ");
                System.out.println(cachedRowSet.getString(2));
                if (cachedRowSet.getInt(1) == 1)
                    cachedRowSet.updateInt(1,3);
            }
            cachedRowSet.acceptChanges();


//            ("SELECT * FROM test")
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
