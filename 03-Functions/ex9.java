
// waf to print greatest comman divisor of 2 nos 
import java.util.*;

public class ex9 {
    public static void gcd(int x, int n) {
        int low, i;
        if (x > n)
            low = n;
        else
            low = x;
        for (i = low; i >= 1; i--) {
            if (x % i == 0 && n % i == 0) {
                System.out.println("gcd is " + i);
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();

        gcd(x, n);
    }
}
