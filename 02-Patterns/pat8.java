//floyds triangle
public class pat8 {
    public static void main(String[] args) {
        int i, j, n = 5, sum = 0;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                sum++;
                System.out.print(sum+" ");
            }
            System.out.println();
        }

    }
}