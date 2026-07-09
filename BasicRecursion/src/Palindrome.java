public class Palindrome {
    public boolean isPalindrome(String str, int s,int e){
        if(s>=e){
            return true;

        }
        if(str.charAt(s)!=str.charAt(e)) return false;
        return isPalindrome(str,s+1,e-1);

    }
}
