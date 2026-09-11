public class MaxNestedDepthOfParenthesis {
    public int solution(String s){
        int maxDepth=0;
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                count++;
                maxDepth=Math.max(count,maxDepth);
            }else if(s.charAt(i)==')'){
                count--;
            }
        }
        return maxDepth;
    }
}
