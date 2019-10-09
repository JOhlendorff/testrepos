/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author jenso
 */
public class BookMapper {
    
      
    Db db;
    
    ArrayList<Book> bookList;
    
    ResultSet rs;

    public BookMapper(String selection) throws SQLException{
        db = new Db();
        Connection connect = db.connection();
        Statement stmt = connect.createStatement();
        rs = stmt.executeQuery("select * from books where author like \"%" + selection + "%\" "
                + "or bookTitle like \"%" + selection +"%\";");
        bookList = new ArrayList();
        
        
    }
    
    public void readDb() throws SQLException{
        while (rs.next()) {
            Book book = new Book();
            book.setId(rs.getInt("bookId"));
            book.setTitle(rs.getString("bookTitle"));
            book.setAuthor(rs.getString("author"));
            book.setPrice(rs.getInt("price"));
            
            bookList.add(book);
        }
    }
    public ArrayList<Book> getBookList() {
        return bookList;
    }
    
    
    
}
