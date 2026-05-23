import java.util.ArrayList;

public class ex3 {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        
        int repeat = -1;
        int miss = -1;
        int n = arr.length;
        
        int[] hash = new int[n+1];
        
        for(int i = 0; i<arr.length; i++){
            hash[arr[i]]++;
        }
        for(int i = 0; i<hash.length; i++){
            System.out.print(hash[i]+" ");
        }
        
        for(int i = 1; i< n+1; i++){
            if(hash[i] == 0){
                miss = i;
            }
            if(hash[i] > 1){
                repeat = i;
            }
        }
        res.add(repeat);
        res.add(miss);
        
        return res;
    }
    public static void main(String[] args) {
        ex3 obj = new ex3();
        int[] arr = {1, 3, 4, 5, 5};
        System.out.println(obj.findTwoElement(arr));

    }
}
