class pat13{
    public static void main(String []args){
        int i,j,n=5,sum;
        for(i=1;i<=n;i++){
            sum = i;
            for(j=1;j<=n-i;j++){
                System.out.print("  ");
            }
        
            for(j=1;j<=i;j++){
                System.out.print(sum+" ");
                sum--;
            }
            for(j=1;j<=i-1;j++){
                sum++;
                System.out.print(sum+1+" ");               
            }            
            System.out.println();
            // sum=i+1;
        }
    }
}