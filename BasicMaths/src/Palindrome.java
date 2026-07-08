public class Palindrome {
    public boolean isPalindrome(int n){
        int k=n;
        int m=0;
        while(n>0){
            int last=n%10;
            m=m*10+last;
            n=n/10;

        }

        return m==k?true:false ;
    }
}
