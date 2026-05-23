// WAP to cal the nth Fibonacci number using recursion.

public class ex4 {
    public static int fibbonacci(int n){
        if(n==0)
        return 0;
        else if(n==1)
        return 1;
        return fibbonacci(n-1)+fibbonacci(n-2);
    }
    public static void main(String[] args) {
        int n=5; 
        int res=fibbonacci(n);
        System.out.println(res);   
    }
}
