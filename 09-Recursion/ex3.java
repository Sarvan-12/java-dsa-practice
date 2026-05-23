// Wap to calculate the factorial of a number n using recursion.

public class ex3 {
    public static int fact(int n){
        if(n==0)
        return 1;
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        int n=5;
        int res=fact(n);
        System.out.println(res);
    }
}
