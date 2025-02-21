
package week5.ManageCourse;

import lab211_tranthidiemkieu_de190595_assignment.Utilizer;

public class OnlineCourse extends Course{
    private String platform;
    private String instructors;
    private String note;

    public OnlineCourse() {
        this.platform = "";
        this.instructors = "";
        this.note = "";
    }

    public OnlineCourse(String idcourse, String course, int credits, String platform, String instructors, String note) {
        super(idcourse, course, credits);
        this.platform = platform;
        this.instructors = instructors;
        this.note = note;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getInstructors() {
        return instructors;
    }

    public void setInstructors(String instructors) {
        this.instructors = instructors;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
    
   @Override
    public void inputAll() {
        super.inputAll(); 
        this.setPlatform(Validation.getString("Enter plantform"));
        this.setInstructors(Validation.getString("Enter instructor: "));
    }
    
    @Override
    public String toString() {
        return super.toString() + ", plantform: " + this.getPlatform() + ", instructors: " + this.getInstructors(); 
        
    }

 
    
}
