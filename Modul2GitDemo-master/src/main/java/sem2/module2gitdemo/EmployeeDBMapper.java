package sem2.module2gitdemo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDBMapper {

    public static List<Employee> getEmployees() throws SQLException, ClassNotFoundException {
        String SQL
                = "SELECT lastName, firstName, email, offices.city as city "
                + "FROM employees "
                + "JOIN offices "
                + "ON employees.officeCode = offices.officeCode;";
        List<Employee> employees = new ArrayList<>();
        try (Connection con = DBConnector.connection(); 
                ResultSet rs = con.createStatement().executeQuery( SQL )) {
            while ( rs.next() ) {
                Employee e = new Employee();
                e.setFirstName( rs.getString( "firstName" ) );
                e.setLastName( rs.getString( "lastName" ) );
                e.setEmail( rs.getString( "email" ) );
                e.setOfficeName( rs.getString( "city" ) );
                employees.add( e );
            }
        }
        return employees;
    }
}
