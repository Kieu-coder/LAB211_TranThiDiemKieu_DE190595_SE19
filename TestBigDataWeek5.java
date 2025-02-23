
import lab211_tranthidiemkieu_de190595_assignment.Utilizer;
import week5.lab.BigData;


public class TestBigDataWeek5 {
    public static void main(String[] args) {
        BigData num1 = new BigData(Utilizer.getString("Enter first number"));
        BigData num2 = new BigData(Utilizer.getString("Enter second number"));
        BigData sum = num1.add(num2);
        BigData product = num1.multiply(num2);
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
    }
}
