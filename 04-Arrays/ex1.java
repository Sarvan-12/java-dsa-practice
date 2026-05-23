import java.util.Arrays;

public class ex1 {
    public static void main(String[] args) {
        // int[] marks=new int[3];
        // marks[0]=81;
        // marks[1]=80;
        // marks[2]=100;
        // for(int i=0;i<3;i++){
        //     System.out.println(marks[i]);

        // }
        int[] marks={81,80,100};
        System.out.println(marks.length);
        for(int i=0;i<3;i++){
                System.out.print(marks[i]+" ");
    
            }   
        Arrays.sort(marks);
        System.out.println(marks[0]);
    }
    
}