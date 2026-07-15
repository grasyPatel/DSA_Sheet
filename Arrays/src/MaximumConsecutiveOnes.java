public class MaximumConsecutiveOnes {
    public int countOne(int arr[]){
        int res=0;
        int maxCount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                res++;
            }
            else{

                res=0;
            }
            maxCount=Math.max(res,maxCount);
        }
        return maxCount;
    }
}
