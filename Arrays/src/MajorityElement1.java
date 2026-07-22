public class MajorityElement1 {
    public int findElement(int arr[]){
//        sort(arr);
//        return arr[arr.length/2]; // the element will be always this position if the array is sorted
        int count=0;
        int ele=0;
        for(int i=0;i<arr.length;i++){
            if(count==0){
                count++;
                ele=arr[i];
            }
            else if(ele==arr[i]){
                count++;
            }
            else{
                count--;
            }

        }
        int count1=0;
        for(int i=0;i<arr.length;i++){
            if(ele==arr[i]){
                count1++;
            }

        }
        if(count1>arr.length/2){
            return ele;
        }
        return -1;
    }
//    public void sort(int arr[]){
//        for(int i=0;i<arr.length-1;i++){
//            int minIndex=i;
//            for(int j=i+1;j<arr.length;j++){
//                if(arr[j]<arr[minIndex]) minIndex=j;
//            }
//            int temp=arr[minIndex];
//            arr[minIndex]=arr[i];
//            arr[i]=temp;
//        }
//    }
}
