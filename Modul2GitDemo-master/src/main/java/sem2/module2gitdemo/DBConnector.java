package sem2.module2gitdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 The purpose of Connector is to...

 @author kasper
 */
public class DBConnector {

    private static String url = "jdbc:mysql://46.101.253.149:3306/classicmodels";
    private static String username = "officelister";

    private static String password = "bank3*andyouarein";

    public static Connection connection() throws ClassNotFoundException, SQLException {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection( url, username, password );
            return connection;
    }

}
