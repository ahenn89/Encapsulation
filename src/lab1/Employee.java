package lab1;

import java.util.Date;

/**
 * Fix the code in this class to do PROPERTY encapsulation correctly. Also
 * consider if any of the properties should be mandatory and use a 
 * constructor to enforce that. Review the tips in the document 
 * "EncapCheckList.pdf" if needed.
 *
 * @author      Jim Lombardo, WCTC Instructor
 * @version     1.02
 */
public class Employee {

    private String firstName;
    private String lastName;
    private String ssn;
    private boolean metWithHr;
    private boolean metDeptStaff;
    private boolean reviewedDeptPolicies;
    private boolean movedIn;
    private String cubeId;
    private Date orientationDate;

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @return the ssn
     */
    public String getSsn() {
        return ssn;
    }

    /**
     * @return the metWithHr
     */
    public boolean isMetWithHr() {
        return metWithHr;
    }

    /**
     * @return the metDeptStaff
     */
    public boolean isMetDeptStaff() {
        return metDeptStaff;
    }

    /**
     * @return the reviewedDeptPolicies
     */
    public boolean isReviewedDeptPolicies() {
        return reviewedDeptPolicies;
    }

    /**
     * @return the movedIn
     */
    public boolean isMovedIn() {
        return movedIn;
    }

    /**
     * @return the cubeId
     */
    public String getCubeId() {
        return cubeId;
    }

    /**
     * @return the orientationDate
     */
    public Date getOrientationDate() {
        return orientationDate;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        if(firstName == null || firstName.length() < 2){
            System.out.println("error");
        }
        this.firstName = firstName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @param ssn the ssn to set
     */
    public void setSsn(String ssn) {
        if(ssn == null || ssn.length() != 9){
            System.out.println("Enter a valid SSN. Must be 9 digits.");
        }else {
            this.ssn = ssn;
        }
    }

    /**
     * @param metWithHr the metWithHr to set
     */
    public void setMetWithHr(boolean metWithHr) {
        this.metWithHr = metWithHr;
    }

    /**
     * @param metDeptStaff the metDeptStaff to set
     */
    public void setMetDeptStaff(boolean metDeptStaff) {
        this.metDeptStaff = metDeptStaff;
    }

    /**
     * @param reviewedDeptPolicies the reviewedDeptPolicies to set
     */
    public void setReviewedDeptPolicies(boolean reviewedDeptPolicies) {
        this.reviewedDeptPolicies = reviewedDeptPolicies;
    }

    /**
     * @param movedIn the movedIn to set
     */
    public void setMovedIn(boolean movedIn) {
        this.movedIn = movedIn;
    }

    /**
     * @param cubeId the cubeId to set
     */
    public void setCubeId(String cubeId) {
        this.cubeId = cubeId;
    }

    /**
     * @param orientationDate the orientationDate to set
     */
    public void setOrientationDate(Date orientationDate) {
        this.orientationDate = orientationDate;
    }

}
