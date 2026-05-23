// greatest of 2 nos 

import java.util.*;

public class ex3 {
    public static void greatestOf2Nos(int a,int b){
        if(a>b)
        System.out.println(a);
        else
        System.out.println(b);


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

greatestOf2Nos(a,b);


    }
}
