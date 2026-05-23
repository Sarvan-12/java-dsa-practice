
// Program to count the number of 1’s in the binary representation of the number
import java.util.Scanner;

public class CountOnes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int count = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n = n >> 1;
        }
        System.out.println("The number of 1's in the binary representation is: " + count);

        scanner.close();
    }
}
