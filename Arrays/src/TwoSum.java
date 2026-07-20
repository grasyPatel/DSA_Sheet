import java.util.HashMap;

public class TwoSum {
    public int[] twoSum1(int arr[], int target){
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int res=target-arr[i];
            if(map.containsKey(res)){
                return new int[]{map.get(res),i};
            }
            map.put(arr[i],i);
        }
        return new int[]{-1, -1};
    }

    public int[] twoSum2(int arr[], int target){
        return new int[]{-1,-1};
    }
}
