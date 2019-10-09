/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testpresentation;

import java.sql.SQLException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import persistence.BookMapper;

/**
 *
 * @author jenso
 */
public class BookMapperTest {
    
    
    private BookMapper bm;
    
    @Before public void setup() throws SQLException{
        
        bm = new BookMapper("Harry Potter");
        
    }

    
    @Test
    public void testBookMapper() throws SQLException{
        bm.readDb();
        assertEquals("JK Rowling", bm.getBookList().get(0).getAuthor());
        
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
