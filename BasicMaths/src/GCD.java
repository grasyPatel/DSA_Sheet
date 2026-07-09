public class GCD {
    public int isGCD(int a, int b){
        while(a>0 && b>0){
            if(a>b){
                a=a%b;
            }else{
                b=b%a;
            }
        }
        return a==0?b:a;

    }
}
