public class SecondLargest {
    public int secondLargestElement(int arr[]){
        int ele1=arr[0];
        int ele2=-1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>ele1){
                ele2=ele1;
                ele1=arr[i];
            }
            else if(arr[i]>ele2 && arr[i]<ele1){
                ele2=arr[i];
            }

        }
        return ele2;
    }
}
