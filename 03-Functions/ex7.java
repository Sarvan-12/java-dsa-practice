import java.util.Scanner;

public class ex7
 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positiveCount = 0, negativeCount = 0, zeroCount = 0;
        String choice;


        do {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            // Counting positive, negative, and zero numbers
            if (number > 0) {
                positiveCount++;
            } else if (number < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }

            // Asking user if they want to continue
            System.out.print("Do you want to enter another number? (y/n): ");
            choice = scanner.next();
        } while (choice.equals("y") || choice.equals("Y")); // Continue if user enters 'y' or 'Y'

        // Displaying the results
        System.out.println("Positive numbers count: " + positiveCount);
        System.out.println("Negative numbers count: " + negativeCount);
        System.out.println("Zero count: " + zeroCount);

        scanner.close();
    }
}