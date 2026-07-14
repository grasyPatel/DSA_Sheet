public class LinerSearch {
    public int search(int arr[], int n, int target){
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                return i+1;
            }
        }
        return -1;
    }
}
