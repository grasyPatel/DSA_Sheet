public class ReverseArray {
    public int[] reverseAnArray(int[]arr,int s,int e){
        if(s>=e){
            return arr;
        }
        int temp =arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
        return reverseAnArray(arr,s+1,e-1);


    }
}
