
package week4.managerInformation;


public class Person {
    private String id;
    private String fullName;
    private String phoneNumber;
    private int yob;
    private String major;

    public Person() {
        this.id = "";
        this.fullName = "";
        this.phoneNumber = "";
        this.yob = 0;
        this.major = "";
    }

    public Person(String id, String fullName, String phoneNumber, int yob, String major) {
        this.id = id;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.yob = yob;
        this.major = major;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

  
    public void inputAll(){
        this.setId(Validation.getId("Enter id"));
        this.setFullName(Validation.getName("Enter full name"));
        this.setPhoneNumber(Validation.getPhone("Enter phone number"));
        this.setYob(Validation.getYear("Enter year of birth"));
        this.setMajor(Validation.getMajor("Enter major"));
        
    }

    @Override
    public String toString() {
        return  "id=" + id + ", fullName=" + fullName + ", phoneNumber=" + phoneNumber + ", yob=" + yob + ", major=" + major + " ";
    }
    
    
}
