public class FirstAndLastOccurrence {
    public int[] solution(int arr[], int target){
        int left=0;
        int right=arr.length-1;
        int index[]={-1,-1};
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==target){
                index[1]=mid;
                left=mid+1;
            }else if(arr[mid]>target) {
                right=mid-1;
            } else{
                left=mid+1;
            }

        }
        left=0;
        right=arr.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==target){
                index[0]=mid;
                right=mid-1;
            }else if(arr[mid]>target) {
                right=mid-1;
            } else{
                left=mid+1;
            }

        }
        return index;
    }

}
