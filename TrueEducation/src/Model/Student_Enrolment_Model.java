
package Model;


public class Student_Enrolment_Model {
    private String ID;
    private String STUDENT_NAME;
    private String GENDER;
    private String MOBILE;
    private String ADDRESS;
    private String PROGRAM_NAME;
    private String BATCH;

    public Student_Enrolment_Model(String ID, String STUDENT_NAME, String GENDER, String MOBILE, String ADDRESS, String PROGRAM_NAME, String BATCH) {
        this.ID = ID;
        this.STUDENT_NAME = STUDENT_NAME;
        this.GENDER = GENDER;
        this.MOBILE = MOBILE;
        this.ADDRESS = ADDRESS;
        this.PROGRAM_NAME = PROGRAM_NAME;
        this.BATCH = BATCH;
    }

    public String getBATCH() {
        return BATCH;
    }

    public void setBATCH(String BATCH) {
        this.BATCH = BATCH;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getSTUDENT_NAME() {
        return STUDENT_NAME;
    }

    public void setSTUDENT_NAME(String STUDENT_NAME) {
        this.STUDENT_NAME = STUDENT_NAME;
    }

    public String getGENDER() {
        return GENDER;
    }

    public void setGENDER(String GENDER) {
        this.GENDER = GENDER;
    }

    public String getMOBILE() {
        return MOBILE;
    }

    public void setMOBILE(String MOBILE) {
        this.MOBILE = MOBILE;
    }

    public String getADDRESS() {
        return ADDRESS;
    }

    public void setADDRESS(String ADDRESS) {
        this.ADDRESS = ADDRESS;
    }

    public String getPROGRAM_NAME() {
        return PROGRAM_NAME;
    }

    public void setPROGRAM_NAME(String PROGRAM_NAME) {
        this.PROGRAM_NAME = PROGRAM_NAME;
    }

    @Override
    public String toString() {
        return "Student_Enrolment_Model{" + "ID=" + ID + ", STUDENT_NAME=" + STUDENT_NAME + ", GENDER=" + GENDER + ", MOBILE=" + MOBILE + ", ADDRESS=" + ADDRESS + ", PROGRAM_NAME=" + PROGRAM_NAME + ", BATCH=" + BATCH + '}';
    }
    
    
    
    
}
