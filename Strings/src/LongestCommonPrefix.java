import java.util.Arrays;

public class LongestCommonPrefix {
    public String solution(String[]arr){
        Arrays.sort(arr);

        String s=arr[arr.length-1];
        String t=arr[0];
        for(int i=0;i<Math.min(s.length(),t.length());i++){
            if(s.charAt(i)!=t.charAt(i)){
                return s.substring(0,i);

            }
        }

        return "";

    }
}
