public class SearchInSortedArrayOne {
    public int solution(int[]arr, int target){
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[left]<=arr[mid]){
               if(arr[left]<=target && arr[mid]>target){
                   right=mid-1;
               }else{
                   left=mid+1;
               }

            }else{
                if(target<=arr[right] && target>arr[mid]){
                    left=mid+1;
                }
                else{
                    right=mid-1;
                }
            }
        }
        return -1;


    }
}
