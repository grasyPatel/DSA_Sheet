import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

//        Q1--
//        PrintNumbers obj1=new PrintNumbers();
//        obj1.printNumber(n);

//        Q2--
//        PrintNto1 obj2=new PrintNto1();
//        obj2.printNumber(n);

//        Q3--
        SumNumbers obj3=new SumNumbers();
        int result=obj3.sumOfNumbers(n);
        System.out.println(result);

    }
}