
package week4.managerInformation;


public class Student extends Person{
    private int yoAdmission;
    private int scoreE;

    public Student() {
        this.yoAdmission = 0;
        this.scoreE = 0;
    }

    public Student(String id, String fullName, String phoneNumber, int yob, String major, int yoAdmission, int scoreE) {
        super(id, fullName, phoneNumber, yob, major);
        this.yoAdmission = yoAdmission;
        this.scoreE = scoreE;
    }

    public int getYoAdmission() {
        return yoAdmission;
    }

    public void setYoAdmission(int yoAdmission) {
        this.yoAdmission = yoAdmission;
    }

    public int getScoreE() {
        return scoreE;
    }

    public void setScoreE(int scoreE) {
        this.scoreE = scoreE;
    }

    @Override
    public void inputAll() {
        super.inputAll(); 
        this.setYoAdmission(Validation.getYearAd("Enter Year of admission", this.getYob()));
        this.setScoreE(Validation.getScore("Enter entrance English score"));
        
    }

    @Override
    public String toString() {
        System.out.println("Student: ");
        return super.toString() + "yoAdmission=" + yoAdmission + ", scoreE=" + scoreE + '}';
    }
    
    
}
