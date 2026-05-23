// WAP to cal x raised to the power n using optimized recursion (divide and conquer approach).

// Example: If x = 2 and n = 5, output = 32 (since 2^5 = 32).

public class ex6 {
    public static int powerOfX(int x,int n){
        if(x==0)
        return 0;
        if(n==0)
        return 1;
        if(n%2==0)
        return powerOfX(x, n/2)*powerOfX(x, n/2);
        else
        return powerOfX(x, n/2)*powerOfX(x, n/2)*x;

    }
    public static void main(String[] args) {
        int x=2;
        int n=5;
        int res=powerOfX(x, n);
        System.out.println(res);
    }
}
