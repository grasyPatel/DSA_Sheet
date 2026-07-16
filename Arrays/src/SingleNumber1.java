import java.util.HashMap;
import java.util.Map;

public class SingleNumber1 {
    public int findNumber(int arr[]){

//        HashMap<Integer,Integer> map=new HashMap<>();
//        for(int i=0;i<arr.length;i++){
//            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
//
//
//        }
//        for(Map.Entry<Integer, Integer> entry:map.entrySet()){
//            int value=entry.getValue();
//            if(value==1){
//                return entry.getKey();
//            }
//        }
//        return -1;

        int xor=0;
        for(int num:arr){
            xor^=num;
        }
        return xor;
    }
}
