package sem2.module2gitdemo;

import java.util.List;

/**
 * The purpose of RenderUtil is to...
 * @author kasper
 */
public class RenderUtil {

    public static String employeeTable(List<Employee> empls){
        if (empls == null) {
            return "No one employed";
        }
        StringBuilder sb = new StringBuilder();
        sb.append( "<table>\n"
        + "<tr><th>Fornavn</th><th>Efternavn</th><th>email</th><th>kontor</th></tr>\n");
        for (Employee e : empls){
            sb.append( "<tr>");
            sb.append( "<td>" ).append( e.getFirstName() ).append("</td>");
            sb.append( "<td>" ).append( e.getLastName() ).append("</td>");
            sb.append( "<td>" ).append( e.getEmail() ).append("</td>");
            sb.append( "<td>" ).append( e.getOfficeName() ).append("</td>");
            sb.append( "</tr>\n");
        }
        sb.append( "</table>\n");
        return sb.toString();
    }
}
