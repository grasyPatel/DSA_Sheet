import java.util.HashMap;
import java.util.Map;

public class HighestFreq {
    public int HighestFrequencyElement(int arr[]){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);

        }
        int freq=0;
        int result=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int value=entry.getValue();
            if(value>freq){
                result=entry.getKey();
                freq=value;

            }

        }
        return result;
    }
}
