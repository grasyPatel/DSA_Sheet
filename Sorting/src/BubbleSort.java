public class BubbleSort {
    public int[] sorting(int arr[],int n){
        for(int i=n-1;i>=0;i--){
            boolean b=false;
            for(int j=1;j<=i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    b=true;
                }
            }
            if(!b){
                return arr;
            }
        }
        return arr;
    }
}
