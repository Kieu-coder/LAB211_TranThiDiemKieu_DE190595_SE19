
package week01;


public class TestCountWC {
    public static void main(String[] args) { 
        
        String input = "Hello World";
        CountWC countWC = new CountWC(input);
        
        System.out.println("Word Counts: " + countWC.countWord());
        System.out.println("Char counts: "+ countWC.countCharacter());
       
        
        
    }
}
