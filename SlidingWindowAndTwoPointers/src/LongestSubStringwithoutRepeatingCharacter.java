import java.util.HashMap;

public class LongestSubStringwithoutRepeatingCharacter {
    public int solution(String s){
        HashMap<Character, Integer> map=new HashMap<>();
        int MaxLen=0;
        int j=0;
        int i=0;

        while(j<s.length()){
            char c=s.charAt(j);

            if(!map.containsKey(c)){
                map.put(c,j);

            }
            else if(map.get(c)>=i && map.get(c)<j){
                map.put(c,j);
                MaxLen=Math.max(MaxLen,j-i);
                i=j;

            }
            j++;



        }
        return MaxLen;
    }
}
