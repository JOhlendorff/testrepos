/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import java.util.ArrayList;
import java.sql.*;  

/**
 *
 * @author jenso
 */
public class QuotesMapper {
    
    
   DB db;
    
    ArrayList<String> quoteList;

    public QuotesMapper() throws SQLException{
        db = new DB();
        Connection connect = db.connection();
        Statement stmt = connect.createStatement();
        ResultSet rs = stmt.executeQuery("select * from qtable");
        quoteList = new ArrayList();
        while(rs.next()){
            quoteList.add(rs.getNString("words"));
        }
    }
    
    public ArrayList<String> getQuoteList() {
        return quoteList;
    }
    
    
}
