public class Fibonacci {
    public int printFibo(int n){
        if(n<=1){
            return n;
        }
        return printFibo(n-1)+printFibo(n-2);
    }
}
