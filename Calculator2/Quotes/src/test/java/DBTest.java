/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import persistence.DB;

/**
 *
 * @author jenso
 */
public class DBTest {
    
    public DBTest() {
    }

    @Test
    public void testDB() throws SQLException{
        ArrayList<String> quoteList = new ArrayList();
        DB db = new DB();
        Connection connect = db.connection();
        Statement stmt = connect.createStatement();
        ResultSet rs = stmt.executeQuery("select * from qtable");
        while(rs.next()){
            quoteList.add(rs.getString("words"));
        }
        assertFalse(!quoteList.isEmpty());
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
