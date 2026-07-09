public class PrintNumbers {
    public void printNumber(int n){
        if(n<1){
            return;
        }

        printNumber(n-1);

        System.out.println(n);
    }
}
