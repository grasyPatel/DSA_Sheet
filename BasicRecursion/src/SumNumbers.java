public class SumNumbers {
    public int sumOfNumbers(int n){
        if(n==1){
            return 1;
        }

        return  n+ sumOfNumbers(n-1);
    }

}
