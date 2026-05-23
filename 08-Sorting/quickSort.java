public class quickSort {
    static void quickSort(int arr[], int low, int high) {
        // code here
        if(low<high){
            int pivotIdx = partition(arr, low, high);

            quickSort(arr,low,pivotIdx-1);
            quickSort(arr,pivotIdx+1, high);
        }
    }

    static int partition(int arr[], int low, int high) {
        // your code here
        int pivot = arr[high];
        int i = low - 1;

        for(int j =low; j<high; j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i]= arr[j];
                arr[j] = temp;
            }
        }i++;
        int temp = arr[i];
        arr[i]= arr[high] ;
        arr[high] = temp;

        return i;


    }
    public static void main(String[] args) {
        int arr[] = { 3,4,2,5,3,4,2,1};
        int n = arr.length;

        quickSort(arr,0,n-1);

        for (int num : arr) {
            System.out.print(num + " ");
        }


    }
}
