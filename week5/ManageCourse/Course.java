
package week5.ManageCourse;


public class Course {
    private String idcourse;
    private String course;
    private int credits;

    public Course() {
        this.idcourse = "";
        this.course = "";
        this.credits = 0;
    }

    public Course(String idcourse, String course, int credits) {
        this.idcourse = idcourse;
        this.course = course;
        this.credits = credits;
    }

    public String getIdcourse() {
        return idcourse;
    }

    public void setIdcourse(String idcourse) {
        this.idcourse = idcourse;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }
    
    
    public void inputAll(){
       this.setIdcourse(Validation.getString("Enter id course"));
        this.setCourse(Validation.getString("Enter name course"));
        this.setCredits(Validation.getCredits("Enter credits"));
    }

    @Override
    public String toString() {
        return "idcourse=" + idcourse + ", course=" + course + ", credits=" + credits;
    }
    
    
}
