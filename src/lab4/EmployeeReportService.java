package lab4;

/**
 * This class simulates a simple type of reporting service that produces
 * output. That's it's Single Responsibility. Notice how easy it would be
 * to change the code in the outputReport method to use a JOptionPane for
 * GUI output instead of using the current console output. And notice that
 * making this change would not cause problems with any other classes.
 * Very flexible!
 * 
 * @author      Jim Lombardo, WCTC Instructor
 * @version     1.02
 */
import java.util.Date;


public class EmployeeReportService {
    
    public void doOutput(String msg){
        System.out.println(msg);
    }

//    private Employee employee;
//
//    public ReportService(Employee employee) {
//        this.employee = employee;
//    }
//
//    public void reportMetWithHr(String formattedDate) {
//        System.out.println(employee.getFirstName() + " " + employee.getLastName() + " met with Hr on "
//                + formattedDate);
//    }
//
//    public void reportMetWithDepartmentStaff(String formattedDate) {
//        System.out.println(employee.getFirstName() + " " + employee.getLastName() + " met with Dept. Staff on "
//                + formattedDate);
//    }
//
//    public void reportReviewedDeptPolicies(String formattedDate) {
//        System.out.println(employee.getFirstName() + " " + employee.getLastName() + " reviewed Dept policies on "
//                + formattedDate);
//    }
//
//    public void reportMovedIntoCubicle(String formattedDate) {
//        System.out.println(employee.getFirstName() + " " + employee.getLastName() + " moved into cubicle "
//                + employee.getCubeId()+ " on " + formattedDate);
//    }

}
