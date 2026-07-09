public class Armstrong {
    public boolean isArmstrong(int n){
        int digits=countDigits(n);
        int result=0;
        while(n>0){
            int last=n%10;
            result+=(int)Math.pow(last,digits);
            n=n/10;
        }
        int newDigits=countDigits(result);
        return digits==newDigits;

    }
    public int countDigits(int n){
        int count=0;
        while(n>0){
            count++;
            n=n/10;
        }
        return count;
    }
}
