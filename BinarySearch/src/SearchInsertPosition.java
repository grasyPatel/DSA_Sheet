public class SearchInsertPosition {
    public int solution(int arr[], int value){
        int left=0, right=arr.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]>=value)  right=mid-1;
            else left=mid+1;
        }
        return left;
    }
}
