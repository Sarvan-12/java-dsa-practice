import java.util.Scanner;

public class add2Nos {
    public static int add(int a,int b){
        int sum=a+b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();


        System.out.println(add(num1,num2));
        System.out.println(add(5,6));

    }
}
