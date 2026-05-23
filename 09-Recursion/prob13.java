// find the no of ways in which u can invite N people to your party ,single or in pairs 
public class prob13 {
    public static int GuestCall(int n){
        if(n<=1)
        return 1;
        int way1= GuestCall(n-1);
        int way2 = GuestCall(n-2)*(n-1);
        return way1+way2;
    }
    public static void main(String[] args) {
        System.out.println(GuestCall(4));
    }
}
