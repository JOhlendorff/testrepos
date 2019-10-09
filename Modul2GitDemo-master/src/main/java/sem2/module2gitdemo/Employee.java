package sem2.module2gitdemo;

/**
 The purpose of Employee is to...

 @author kasper
 */
public class Employee {

    private int employeeNumber;
    private String lastName;
    private String firstName;
    private String extension;
    private String email;
    private int officeCode;
    private String officeName;
    private int reportsTo;
    private String jobTitleString; 

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber( int employeeNumber ) {
        this.employeeNumber = employeeNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName( String lastName ) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName( String firstName ) {
        this.firstName = firstName;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension( String extension ) {
        this.extension = extension;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail( String email ) {
        this.email = email;
    }

    public int getOfficeCode() {
        return officeCode;
    }

    public void setOfficeCode( int officeCode ) {
        this.officeCode = officeCode;
    }

    public int getReportsTo() {
        return reportsTo;
    }

    public void setReportsTo( int reportsTo ) {
        this.reportsTo = reportsTo;
    }

    public String getJobTitleString() {
        return jobTitleString;
    }

    public void setJobTitleString( String jobTitleString ) {
        this.jobTitleString = jobTitleString;
    }

    public String getOfficeName() {
        return officeName;
    }

    public void setOfficeName( String officeName ) {
        this.officeName = officeName;
    }
}
