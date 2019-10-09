/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Random;
import persistence.QuotesMapper;

/**
 *
 * @author jenso
 */
public class Quotes {
    
    ArrayList<String> Quotelist = new ArrayList();
    
    QuotesMapper qm = new QuotesMapper();
    
    public Quotes() throws SQLException{
        QuotesMapper qM = new QuotesMapper();
        for (String string : qm.getQuoteList()) {
            Quotelist.add(string);
        }
    }
    
    public String randomQuote(){
        Random rand = new Random();
        int i = rand.nextInt(Quotelist.size());
        String quote = Quotelist.get(i);
        return quote;
    }
}
