import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();

//        Q1--
//        PrintNumbers obj1=new PrintNumbers();
//        obj1.printNumber(n);

//        Q2--
//        PrintNto1 obj2=new PrintNto1();
//        obj2.printNumber(n);

//        Q3--
//        SumNumbers obj3=new SumNumbers();
//        int result=obj3.sumOfNumbers(n);
//        System.out.println(result);

//        Q4--
//        Factorial obj4=new Factorial();
//        System.out.println(obj4.factorialOfN(n));

//        Q5--
//          int arr[]=new int[n];
//          for(int i=0;i<n;i++){
//              arr[i]=sc.nextInt();
//          }
//          System.out.println("Original Array "+Arrays.toString(arr));
//          ReverseArray obj5=new ReverseArray();
//          System.out.println("Reversed Array "+Arrays.toString(obj5.reverseAnArray(arr,0,n-1)));

//        Q6--
        String s =sc.nextLine();
        Palindrome obj6=new Palindrome();
        System.out.println(obj6.isPalindrome(s,0,s.length()-1));




    }
}