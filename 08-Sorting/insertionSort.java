public class insertionSort {
    public static void printArray(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

    }
    public static void main(String[] args) {
        int a[]={7,8,3,1,2};

        for(int i=1;i<a.length;i++){
            int cur=a[i];
            int j=i-1;
            while(j>=0 && cur<a[j]){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=cur;
        }
        printArray(a);

        }
}

