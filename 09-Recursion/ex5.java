// WAP to cal x raised to the power n using recursion.

// Example: If x = 2 and n = 5, output = 32 (since 2^5 = 32).

public class ex5 {
    public static int powerOfX(int x,int n){
        if(x==0)
        return 0;
        if(n==0)
        return 1;
        return x*powerOfX(x,n-1);
    }
    public static void main(String[] args) {
        int x=2;
        int n=5;
        int res=powerOfX(x, n);
        System.out.println(res);
    }
}
