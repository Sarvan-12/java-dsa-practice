public class pat7 {
    public static void main(String[] args) {
        int i, j, n = 5, m = 4;
        // for (i = n; i >=1; i--) {
        //     for (j = 1; j <= i; j++) {
        //         System.out.print(j + " ");
        //     }
        //     System.out.println();
        // }
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n-i+1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}