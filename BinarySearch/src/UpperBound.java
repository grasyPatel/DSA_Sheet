public class UpperBound {
    public int solution(int arr[], int target){
        int left=0, right=arr.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]>target){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return left;

    }
}
