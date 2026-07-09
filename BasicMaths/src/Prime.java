public class Prime {
    public boolean isPrime(int n){
        int count=0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                count++;
                if(i!=n/i){
                    count++;
                }
            }
        }
        return count==2?true:false;
    }
}
