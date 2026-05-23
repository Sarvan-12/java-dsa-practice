import java.util.*;
public class ex1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,j;

        int rows=sc.nextInt();
        int col=sc.nextInt();

        int[][] matrix=new int[rows][col];

        for(i=0;i<rows;i++){
            for(j=0;j<col;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        for(i=0;i<rows;i++){
            for(j=0;j<col;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }



    }
}