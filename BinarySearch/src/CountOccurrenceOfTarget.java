public class CountOccurrenceOfTarget {
    public int solution(int[]arr, int target){
        int  left=0, right=arr.length-1, rightIndex=-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==target) {
                rightIndex=mid;
                left=mid+1;
            }
            else if(arr[mid]>target){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        left=0;
        right=arr.length-1;
        int leftIndex=-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==target){
                leftIndex=mid;
                right=mid-1;
            }
            else if(arr[mid]>target){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        if(leftIndex==-1 && rightIndex==-1) return 0;
        return rightIndex-leftIndex+1;


    }
}
