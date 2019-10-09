package sem2.module2gitdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 The purpose of Connector is to...

 @author kasper
 */
public class DBConnector {

   
    /*jdbc.driver=com.mysql.jdbc.Driver
jdbc.url=jdbc:mysql://206.189.57.7:3306/bookshop
jdbc.username=batman
jdbc.password=Password123!
*/
    

    public static Connection connection() throws ClassNotFoundException, SQLException {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection( url, username, password );
            return connection;
    }

}
