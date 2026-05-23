// waf to print circumference of the circle 
import java.util.*;

public class ex4 {
    public static double circumference(int r){
        return 2*Math.PI*r;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();

        System.out.println(circumference(r));


    }
}

