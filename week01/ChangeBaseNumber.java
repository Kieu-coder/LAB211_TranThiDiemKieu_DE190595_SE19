
package week01;


public class ChangeBaseNumber {
    String input, output;

    public ChangeBaseNumber(String input, String output) {
        this.input = input;
        this.output = output;
    }

    public ChangeBaseNumber() {
    }
    
   int binToDec(String binary) {
        int decimal = 0;
        for (int i = 0; i < binary.length(); i++) {
            char c = binary.charAt(i);
            if (c == '1') {
                decimal += Math.pow(2, binary.length() - i - 1);
            }
        }
        return decimal;
    }

    int hexToDec(String hexa) {
        int decimal = 0;
        for (int i = 0; i < hexa.length(); i++) {
            char hexChar = hexa.charAt(i);
            int hexValue = 0;
            if (hexChar >= '0' && hexChar <= '9') {
                hexValue = hexChar - '0';
            } else if (hexChar >= 'A' && hexChar <= 'F') {
                hexValue = hexChar - 'A' + 10;
            } else if (hexChar >= 'a' && hexChar <= 'f') {
                hexValue = hexChar - 'a' + 10;
            }
            decimal += hexValue * Math.pow(16, hexa.length() - i - 1);
        }
        return decimal;
    }

    String decToBin(int dec) {
        if (dec == 0) {
            return "0";
        }
        int[] binary = new int[32];
        int index = 0;

        while (dec > 0) {
            binary[index] = dec % 2;
            dec = dec / 2;
            index++;
        }

        StringBuilder binaryString = new StringBuilder();
        for (int i = index - 1; i >= 0; i--) {
            binaryString.append(binary[i]);
        }

        return binaryString.toString();
    }

    String decToHex(int dec) {
        if (dec == 0) {
            return "0";
        }
        char[] hexChars = new char[100];
        int index = 0;

        while (dec > 0) {
            int remainder = dec % 16;
            char hexChar;
            if (remainder < 10) {
                hexChar = (char) (remainder + '0');
            } else {
                hexChar = (char) (remainder - 10 + 'A');
            }
            hexChars[index++] = hexChar;
            dec = dec / 16;
        }

        StringBuilder hexString = new StringBuilder();
        for (int i = index - 1; i >= 0; i--) {
            hexString.append(hexChars[i]);
        }

        return hexString.toString();
    }
}
