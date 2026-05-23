// Program to find if a number is a power of 2 or not
import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number > 0 && (number & (number - 1)) == 0) {
            System.out.println(number + " is a power of 2.");
        } else {
            System.out.println(number + " is not a power of 2.");
        }

        scanner.close();
    }
}
