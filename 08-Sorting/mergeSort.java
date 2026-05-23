public class mergeSort {
    public static void inversionCount(int arr[]) {
        // Your Code Here
        int n = arr.length;
        mergeSort(arr, 0, n-1);
        
    }
    public static void mergeSort(int arr[],int low,int high){
        if(low>=high) return;
        int mid = (low + high)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merge(arr,low,mid,high);
    }
    public static void merge(int arr[], int low, int mid, int high){
        int left = low;
        int right = mid + 1;
        int temp[] = new int[high - low + 1];
        int idx = 0;

        while( left <= mid && right <= high){
            if( arr[left] > arr[right]){
                temp[idx++] = arr[right++];
            }else{
                temp[idx++] = arr[left++];
            }
        }
        while( left <= mid ){
            temp[idx++] = arr[left++];
        }
        while( right <= high){
            temp[idx++] = arr[right++];
        }
        for(int i = 0; i<temp.length; i++){
            arr[low + i] = temp[i];
        }
        
    }
    public static void main(String[] args) {
        int arr[] = { 2, 4, 1, 3, 5};
        inversionCount(arr);
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
