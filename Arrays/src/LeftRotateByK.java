public class LeftRotateByK {
    public int[] rotateByK(int arr[],int k){
        k=k%arr.length;
        reverseArray(arr,0,k-1);
        reverseArray(arr,k,arr.length-1);
        reverseArray(arr,0,arr.length-1);
        return arr;


    }
    public void reverseArray(int arr[], int start, int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;

        }
    }
}
