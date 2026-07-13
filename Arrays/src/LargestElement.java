public class LargestElement {
    public int largestElementInArray(int []arr){
        int result=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>result){
                result=arr[i];
            }
        }
        return result;

    }
}
