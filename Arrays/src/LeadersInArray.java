import java.util.ArrayList;
import java.util.Arrays;

public class LeadersInArray {
    public void solution(int []arr){
        int value=arr[arr.length-1];
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(value);
        int maxValue=value;
        for (int i=arr.length-2;i>=0;i--){
            if(arr[i]>value && arr[i]>maxValue){
                ans.add(0, arr[i]);
                value=arr[i];
            }
            maxValue=Math.max(arr[i],maxValue);



        }
        System.out.println(ans);



    }
}
