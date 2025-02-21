
package week5.ManageCourse;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class OfflineCourse extends Course{
    private LocalDate begin;
    private LocalDate end;
    private String campus;

    public OfflineCourse() {
        this.begin = null;
        this.end = null;
        this.campus = "";
    }

    public OfflineCourse(LocalDate begin, LocalDate end, String campus, String idcourse, String course, int credits) {
        super(idcourse, course, credits);
        this.begin = begin;
        this.end = end;
        this.campus = campus;
    }

    public LocalDate getBegin() {
        return begin;
    }

    public void setBegin(LocalDate begin) {
        this.begin = begin;
    }

    public LocalDate getEnd() {
        return end;
    }

    public void setEnd(LocalDate end) {
        this.end = end;
    }

   
    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    
    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return super.toString()+ ", date begin: " + this.getBegin().format(formatter) + ", date end: " + this.getEnd().format(formatter) 
                + ", campus: " + this.getCampus();
    }

    @Override
    public void inputAll() {
        super.inputAll();  
        this.setBegin(Validation.getDate("Enter date: ",LocalDate.now()));
        this.setEnd(Validation.getDate("Enter end date: ", getBegin()));
        this.setCampus(Validation.getString("Enter campus"));
    }
    
    
    
}
