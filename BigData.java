
package week5.lab;


public class BigData {
    private char[] number;

    public BigData(String num) {
        this.number = num.toCharArray();
    }

    public char[] getNumber() {
        return number;
    }
    
    
    public BigData add(BigData other){
        char[] num1 = this.number;
        char[] num2 = other.getNumber();
        int len1 = num1.length, len2 = num2.length;
        int maxlenght = Math.max(len2, len2) +1;
        int[] result = new int[maxlenght];
        
        int temp=0, i=len1-1, j=len2-1, k=maxlenght-1;
        while(i>= 0 || j>=0 || temp>0){
            int digit1= (i>=0) ?num1[i--] -'0':0;
            int digit2 = (j>= 0)? num2[j--] -'0':0;
            int sum = digit1+digit2 + temp;
            result[k--] = sum%10;
            temp= sum/10;
        }
        StringBuilder sb = new StringBuilder();
        for (int val : result) {
            if(!(sb.length() == 0 && val ==0)){
                sb.append(val);
            }
        }
        return new BigData(sb.toString());
        
    }
    
    public BigData multiply(BigData other){
        char[] num1 = this.number;
        char[] num2= other.getNumber();
        int len1 = num1.length, len2 = num2.length;
        int[] product = new int[len1 + len2];
        
        for (int i = len1 -1; i>=0; i--) {
            for (int j = len2 -1; j >= 0; j--) {
                int mul = (num1[i] - '0') * (num2[j] - '0');
                int sum = mul + product[i + j +1];
                
                product[i + j +1] = sum%10;
                product[i+j] += sum/10;
            }
            
        }
        StringBuilder sb = new StringBuilder();
        for (int i : product) {
            if(!(sb.length() == 0 && i == 0)){
                sb.append(i);
            }
        }
        return new BigData(sb.length() == 0? "0" : sb.toString());
    }

    @Override
    public String toString() {
        return new String(number);
    }
    
}
