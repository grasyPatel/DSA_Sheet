public class PrintNto1 {
    public void printNumber(int n){
        if(n<1){
            return;
        }
        System.out.println(n);
        printNumber(n-1);
    }
}
