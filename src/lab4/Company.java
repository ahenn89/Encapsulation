/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author Ashlee
 */
public class Company {
    private HiringManager hm;
    
    public Company() {
        hm = new HiringManager();
    }
    
    public void hireEmployee(String firstName, String lastName, String ssn) {
        hm.hireNewEmployee(firstName, lastName, ssn);
        hm.outputHiringReport(ssn);
    }

    public HiringManager getHm() {
        return hm;
    }

    public void setHm (HiringManager hm) {
        this.hm = hm;
    }
}
