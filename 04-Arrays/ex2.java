import java.util.*;
public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int i;
        int[] num=new int[size];

        for(i=0;i<size;i++){
            num[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        for(i=0;i<size;i++){
            if(num[i]==x)
            System.out.println("x found at index "+i);
        }
    }
}
