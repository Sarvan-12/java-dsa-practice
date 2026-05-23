// place tiles of size 1xm in a floor of size nxm,n=4,n=2 
public class prob12 {
    public static int placeTiles(int n, int m){
        if(n==m){
            return 2;
        }if(n<m){
            return 1;
        }
        int verPlace = placeTiles(n-m, m);
        int horPlace = placeTiles(n-1, m);
        return verPlace + horPlace;

    }
    public static void main(String[] args) {
        int res = placeTiles(4, 2);
        System.out.println(res);
    }
}
