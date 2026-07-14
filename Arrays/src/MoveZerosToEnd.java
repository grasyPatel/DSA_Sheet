public class MoveZerosToEnd {
    public void moveElement(int arr[],int n){
        int i=0;
        int j=0;
        while(j<n){
            if(arr[j]!=0) {
                if (arr[i] == 0) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i]=temp;
                    i++;


                }

            }
            j++;
        }
    }
}
