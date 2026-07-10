import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountFrequencies {
    public List<List<Integer>> DuplicateFrequency(int []arr){
        List<List<Integer>> result=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            List<Integer> temp=new ArrayList<>();
            temp.add(entry.getKey());
            temp.add(entry.getValue());
            result.add(temp);



        }
        return result;
    }
}
