
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jenso
 */
public class sqlconnecttest {
    
    
    public static void main(String[] args) throws SQLException {
        
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
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery("select * from qtable");
        ArrayList<String> quoteList = new ArrayList();
        while(rs.next()){
            quoteList.add(rs.getString(1));
        }
        
        connection.close();
        
        for (String string : quoteList) {
            System.out.println(string);
        }
        
    }
    
    
}
