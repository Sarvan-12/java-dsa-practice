// cheack if an array is sorted 
public class prob4 {

public static boolean isSorted(int a[],int idx){
    if(idx==a.length-1)
    return true;
    if(a[idx]<a[idx+1]){
        //sorted till now
        return isSorted(a,idx+1);
    }
    else
    return false;
}    
public static void main(String[] args) {
        // int a[]={1,2,3,5};
        System.out.println((isSorted(new int[]{1,2,3,5},0)));
    }
}
