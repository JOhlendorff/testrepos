/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import java.sql.*;


public class DB {
    
    public Connection connection() {
        Connection connection = null;
        try {
            String DRIVER = "com.mysql.cj.jdbc.Driver";
            String user = "root";
            String password = "1234";
            String IP = "localhost";
            String PORT = "3306";
            String DATABASE = "quotes";
            String url = "jdbc:mysql://" + IP + ":" + PORT + "/" + DATABASE
                    + "?useUnicode=true&useJDBCcompliantTimezoneShift=true&"
                    + "useLegacyDatetimeCode=false&"
                    + "serverTimezone=UTC";
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(url, user, password);

        } catch (Exception e) {
            System.out.println(e);
        }
        
        return connection;
    }
}
