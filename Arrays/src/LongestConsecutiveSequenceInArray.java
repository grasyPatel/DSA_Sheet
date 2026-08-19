import java.util.Arrays;

public class LongestConsecutiveSequenceInArray {
    public int solution(int[]arr){
        Arrays.sort(arr);
        int maxLength=1;
        System.out.println(Arrays.toString(arr));
        int len=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]==arr[i]-1){
                len++;
            }
            else{

                maxLength=Math.max(maxLength,len);
                len=1;
            }

        }
        return Math.max(maxLength,len);
    }
}
