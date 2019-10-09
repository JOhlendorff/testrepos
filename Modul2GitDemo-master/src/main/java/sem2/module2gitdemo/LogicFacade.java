package sem2.module2gitdemo;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * The purpose of LogicFacade is to...
 * @author kasper
 */
class LogicFacade {

    static List<Employee> getEmployees() throws SQLException, ClassNotFoundException {
        return EmployeeDBMapper.getEmployees();
    }
    
    static List<Employee> getEmployees_2() {
        List<Employee> empls = new ArrayList<>();
        Employee empl = new Employee();
        empl.setEmail( "hans@classicmodels.com");
        empl.setFirstName( "Hans");
        empl.setLastName( "Jenzen");
        empl.setOfficeName( "Køvenhavn" );
        empls.add( empl );
        empl = new Employee();
        empl.setEmail( "ali@classicmodels.com");
        empl.setFirstName( "Ali");
        empl.setLastName( "Buragazi");
        empl.setOfficeName( "Istanbul" );
        empls.add( empl );
        empl = new Employee();
        empl.setEmail( "sara@classicmodels.com");
        empl.setFirstName( "Sara");
        empl.setLastName( "Nonnenot");
        empl.setOfficeName( "Køvenhavn" );
        empls.add( empl );
        return empls;
    }

}
