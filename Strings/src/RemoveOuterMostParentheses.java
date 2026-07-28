public class RemoveOuterMostParentheses {
    public String solution(String s){
        StringBuilder sb=new StringBuilder();
        boolean outerP=false;
        boolean innerP=false;
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' && outerP==false){
                outerP=true;
            }
            else if(s.charAt(i)==')' && innerP==false){
                outerP=false;
            }
            else if(s.charAt(i)=='(' && outerP==true){
                sb.append(s.charAt(i));
                innerP=true;
                count++;
            }
            else if(s.charAt(i)==')' && innerP==true){
                sb.append(s.charAt(i));
                count--;
                if(count==0){
                    innerP=false;
                }


            }

        }
        return sb.toString();
    }
}
