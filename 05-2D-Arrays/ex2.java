import java.util.*;
public class ex2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,j;

        int rows=sc.nextInt();
        int col=sc.nextInt();

        int x=sc.nextInt();

        int[][] matrix=new int[rows][col];

        for(i=0;i<rows;i++){
            for(j=0;j<col;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        for(i=0;i<rows;i++){
            for(j=0;j<col;j++){
                if(matrix[i][j]==x){
                    System.out.println(i+" "+j);

                }
            }
           
        }
    }
}