
package week4.managerInformation;


public class Teacher extends Person{
    private int yp;
    private String contractType;
    private double salaryCoefficient;

    public Teacher() {
        this.yp = 0;
        this.contractType = "";
        this.salaryCoefficient = 0;
    }    

    public Teacher(String id, String fullName, String phoneNumber, int yob, String major,int yp, String contractType, double salaryCoefficient) {
        super(id, fullName, phoneNumber, yob, major);
        this.yp = yp;
        this.contractType = contractType;
        this.salaryCoefficient = salaryCoefficient;
    }

    public int getYp() {
        return yp;
    }

    public void setYp(int yp) {
        this.yp = yp;
    }

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    public double getSalaryCoefficient() {
        return salaryCoefficient;
    }

    public void setSalaryCoefficient(double salaryCoefficient) {
        this.salaryCoefficient = salaryCoefficient;
    }

    @Override
    public void inputAll() {
        super.inputAll(); 
        this.setYp(Validation.getYearProfession("Enter year in the profession", this.getYob()));
        this.setContractType(Validation.getContractType("Enter contract type is ‘Long’ or ‘Short’"));
        this.setSalaryCoefficient(Validation.getNumber("Enter salary coefficient"));
    }

    @Override
    public String toString() {
        System.out.println("Teacher: ");
        return super.toString()+ "yp=" + yp + ", contractType=" + contractType + ", salaryCoefficient=" + salaryCoefficient + '}';
    }
    
    
}
