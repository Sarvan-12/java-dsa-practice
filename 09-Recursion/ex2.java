// Wap to calculate the sum of the first n natural numbers using recursion.

public class ex2 {
    int sum=0;
    public static int sumOfN(int n){
        if(n==0)
        return 0;
        return n+sumOfN(n-1);
    }
    public static void main(String[] args) {
        int n=5;
        int res=sumOfN(n);
        System.out.println(res);
    }
}
