import java.util.*;

public class fact {

    public static int Factorial(int n) {
        int f = 1;
        for (int i = n; i >= 0; i--) {
            if (i == 1 || i == 0)
                f *= 1;
            else
            f *= i;
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       System.out.println(Factorial(n));

    }
}
