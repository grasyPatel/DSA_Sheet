public class RearrangeElementBySign {
    public int[] solution(int[]arr){
        int []newarr=new int[arr.length];
        int pos=0;
        int neg=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0){
                newarr[pos]=arr[i];
                pos+=2;
            }
            else{
                newarr[neg]=arr[i];
                neg+=2;
            }
        }


        return newarr;
    }
}
