// waf to print the sum of odd nos from 1-n
import java.util.*;

public class ex2 {
    public static int sumOfOddNos(int n){
        int i,sum=0;
        for(i=1;i<=n;i++){
            if(i%2==1)
            sum+=i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(sumOfOddNos(n));


    }
}
