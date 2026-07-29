public class ReverseEveryWordInString {
    public String solution(String s){
//        String[] arr=s.split(" ");
//        StringBuilder sb=new StringBuilder();
//        for(int i=arr.length-1;i>=0;i--){
//            sb.append(arr[i]);
//            if(i>0){
//                sb.append(" ");
//            }
//        }
//        return sb.toString();

        StringBuilder sb=new StringBuilder();
        int i=s.length()-1;
        while(i>=0){
            while(i>=0 &&  s.charAt(i)==' '){
                i--;
            }
            if(i<0){
                break;
            }
            int end=i;
            while(i>=0 && s.charAt(i)!=' '){
                i--;
            }
            String word=s.substring(i+1,end+1);
            if(sb.length()>0){
                sb.append(" ");
            }
            sb.append(word);


        }
        return sb.toString();

    }
}
