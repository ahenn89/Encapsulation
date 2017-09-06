/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Ashlee
 */

public class HiringManager {

    private List<Employee> allEmployees;

    public HiringManager() {
        allEmployees = new ArrayList();
    }
    
    public void hireNewEmployee(String firstName, String lastName, String ssn) {
        Employee e = new Employee(firstName, lastName, ssn);
        e.setFirstName(firstName);
        e.setLastName(lastName);
        e.setSsn(ssn);
        allEmployees.add(e);
        orientNewEmployee(e);
    }
    
    //delegation to employee to complete orientation
    public void orientNewEmployee(Employee e) {
        e.doFirstTimeOrientation("1234");
    }
        
    //report back to "boss" that employee has been hired and properly oriented
    public void outputHiringReport(String ssn){
        Employee e = null;
        
        //validate employee is hired (in arraylist)
            //struggled using traditional for loop syntax here. Obviously this works, but why?
                //doesn't quite look like ternary operator. 
        for(Employee emp : allEmployees){
            if (emp.getSsn().equals(ssn)){
                e = emp;
                break;
            } else {
                return;
            } 
        }
        
        if(e.isMetWithHr() && e.isMetDeptStaff() && e.isReviewedDeptPolicies()
                && e.isMovedIn()) {
            e.getReportService().outputReport();
        }
    }

    public List<Employee> getAllEmployees() {
        return allEmployees;
    }

    public void setAllEmployees(List<Employee> allEmployees) {
        this.allEmployees = allEmployees;
    }
}
