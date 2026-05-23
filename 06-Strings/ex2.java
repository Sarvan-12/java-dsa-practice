//string builder 
import java.util.*;

public class ex2 {
    public static void main(String[] args) {
        String s = "Sarvan";
        StringBuilder sb=new StringBuilder(s);
        
        System.out.println(sb);

        //char at index 0
        System.out.println(sb.charAt(0));

        //set char index at 0
        sb.setCharAt(0,'P');
        System.out.println(sb);

        //insert char at index 0
        sb.insert(0,'S');
        System.out.println(sb);

        //delete at index 
        sb.delete(1,2);     //similer to slicing , delete(start,end);
        System.out.println(sb);

        //append
        sb.append(" Suvarna");
        System.out.println(sb);

        //length
        System.out.println((sb.length()));

        sb.reverse();
        System.out.println(sb);

        //reverse the string
        for(int i=0;i<sb.length()/2;i++){
            int front=i;
            int back=sb.length()-1-i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front,backChar);
            sb.setCharAt(back,frontChar);

        }
        System.out.println(sb);

    }
    
}
