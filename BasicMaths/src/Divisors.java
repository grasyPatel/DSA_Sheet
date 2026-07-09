import java.util.ArrayList;

public class Divisors {
    public ArrayList<Integer> isDivisor(int n){
        ArrayList<Integer> result=new ArrayList<>();

        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                result.add(i);
                if(i!=n/i) {
                    result.add(n / i);
                }
            }
        }
        return result;
    }
}
