package week6.workerInformation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class SalaryHistory{
    private String type;
    private double amount;
    private LocalDate date;

    public SalaryHistory() {
    }

    public SalaryHistory(String type, double amount, LocalDate date) {
        this.type = type;
        this.amount = amount;
        this.date = date;
    }

    

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
    
    void salary(double amount){
        this.setType(ValidationWeek6.getType("Enter status (up/down)"));
        this.setAmount(amount);
        this.setDate(ValidationWeek6.getDateUpdate("Enter date update"));
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return String.format("| %-20s | %-10s |%-20s ", this.amount, this.type, this.date.format(formatter));
       
    }
    
    
}
