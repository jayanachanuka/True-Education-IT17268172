
package Model;

public class Manage_Programs_Model {
    private String COURSE_ID;
    private String COURSE_NAME;
    private String COURSE_TYPE;
    private String DURATION;
    private String FEES;
    private String CONTENT;
    private String STATUS;

    public Manage_Programs_Model(String COURSE_ID, String COURSE_NAME, String COURSE_TYPE, String DURATION, String FEES, String CONTENT, String STATUS) {
        this.COURSE_ID = COURSE_ID;
        this.COURSE_NAME = COURSE_NAME;
        this.COURSE_TYPE = COURSE_TYPE;
        this.DURATION = DURATION;
        this.FEES = FEES;
        this.CONTENT = CONTENT;
        this.STATUS = STATUS;
    }

    public String getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(String STATUS) {
        this.STATUS = STATUS;
    }

    public String getCOURSE_ID() {
        return COURSE_ID;
    }

    public void setCOURSE_ID(String COURSE_ID) {
        this.COURSE_ID = COURSE_ID;
    }

    public String getCOURSE_NAME() {
        return COURSE_NAME;
    }

    public void setCOURSE_NAME(String COURSE_NAME) {
        this.COURSE_NAME = COURSE_NAME;
    }

    public String getCOURSE_TYPE() {
        return COURSE_TYPE;
    }

    public void setCOURSE_TYPE(String COURSE_TYPE) {
        this.COURSE_TYPE = COURSE_TYPE;
    }

    public String getDURATION() {
        return DURATION;
    }

    public void setDURATION(String DURATION) {
        this.DURATION = DURATION;
    }

    public String getFEES() {
        return FEES;
    }

    public void setFEES(String FEES) {
        this.FEES = FEES;
    }

    public String getCONTENT() {
        return CONTENT;
    }

    public void setCONTENT(String CONTENT) {
        this.CONTENT = CONTENT;
    }
    
    
    
    
}
