public class LargestOddNumberInString {
    public String solution(String s){

        int i=s.length()-1;
        while(i>=0){
            int value=s.charAt(i)-'0';
            if(value%2!=0){
                break;
            }
            i--;
        }
        int j=0;
        while(j<i){
            if(s.charAt(j)!='0'){
                break;
            }
            j++;
        }
        return s.substring(j,i+1);

    }
}
