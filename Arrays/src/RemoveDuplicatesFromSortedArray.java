public class RemoveDuplicatesFromSortedArray {
    public int remove(int arr[],int n){
        int j=1;
        int unique=0;
        while(j<n){
            if(arr[j]!=arr[unique]){
                if(j>unique+1){
                    int temp=arr[unique+1];
                    arr[unique+1]=arr[j];
                    arr[j]=temp;

                }
                unique++;

                j++;
            }
            else if(arr[j]==arr[unique]){
                j++;

            }
        }
        return unique+1;
    }

}
