// tower of hanoi 

public class prob1 {
    static int steps=0;
    public static void towerOfHonai(int n,String src,String helper,String dest){
        if(n==1){
            System.out.println("transfer disk "+n+" from "+src+" to "+dest);
            steps++;
            return;
        }
        towerOfHonai(n-1,src,dest,helper);
        steps++;
        System.out.println("transfer disk "+n+" from "+src+" to "+dest);
        towerOfHonai(n-1,helper,src,dest);


    }
    public static void main(String[] args) {
        int n=3;
        towerOfHonai(n,"A","B","C");
        System.out.println(steps);

    }
}
