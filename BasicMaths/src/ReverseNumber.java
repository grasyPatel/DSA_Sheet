public class ReverseNumber {
    public int reverse(int n){
        int result=0;
        while(n>0){
            int last=n%10;
            result=result*10+last;
            n=n/10;
        }

        return result;
    }
}
