public class Sort012 {
    public int[] sorting(int arr[]){
        int i=0;
        int j=arr.length-1;
        int k=0;
        while(i<=j){
            if(arr[i]==2){
                arr[i]=arr[j];
                arr[j]=2;
                j--;
            }
            else if(arr[i]==0){
                arr[i]=arr[k];
                arr[k]=0;
                k++;
            }else{
                i++;
            }
        }
        return arr;
    }
}
