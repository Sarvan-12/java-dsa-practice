// Program with two functions: decimalToBinary() and binaryToDecimal()
import java.util.Scanner;

public class NumberSystemConversion {

    // Function to convert decimal to binary
    public static String decimalToBinary(int decimal) {
        String binary = "";
        while (decimal > 0) {
            binary = (decimal % 2) + binary;
            decimal = decimal / 2;
        }
        return binary.isEmpty() ? "0" : binary;
    }

    // Function to convert binary to decimal
    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int base = 1; // Represents 2^0
        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                decimal += base;
            }
            base *= 2;
        }
        return decimal;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Decimal to Binary
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();
        String binary = decimalToBinary(decimal);
        System.out.println("Binary representation: " + binary);

        // Binary to Decimal
        System.out.print("Enter a binary number: ");
        String binaryInput = scanner.next();
        int decimalResult = binaryToDecimal(binaryInput);
        System.out.println("Decimal representation: " + decimalResult);

        scanner.close();
    }
}
