public class FindMissingNumberRange0ton {
    public int missingElement(int arr[]){
        int i=0;
        while(i<arr.length){

            int correctIndex=arr[i];

            if( arr[i]<arr.length && arr[i]!=arr[correctIndex]){
                int temp=arr[i];
                arr[i]=arr[correctIndex];
                arr[correctIndex]=temp;
            }
            else{
                i++;
            }

        }
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=j){

                return j;

            }
        }
        return arr.length;
    }


}
