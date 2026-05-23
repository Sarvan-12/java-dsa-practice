
import java.util.*;
public class prob14 {
    public static void findSubsets(int n,ArrayList<Integer> subset){
        if(n==0){
           
            System.out.println(subset);
            return;

        }
        //after adding 
        subset.add(n);
        findSubsets(n-1, subset);

        // else 
        subset.remove(subset.size()-1);
        findSubsets(n-1, subset);


    }
    public static void main(String[] args) {
        int n=3;
        ArrayList<Integer> subset = new ArrayList<>();
        findSubsets(3,subset);
    }
}
