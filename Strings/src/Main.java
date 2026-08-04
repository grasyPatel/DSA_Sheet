import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String t=sc.next();

//        Q1--
//        RemoveOuterMostParentheses obj1=new RemoveOuterMostParentheses();
//        System.out.println("Original String: "+ s);
//        System.out.println("New String: "+ obj1.solution(s));

//        Q2--
//        ReverseEveryWordInString obj2=new ReverseEveryWordInString();
//        System.out.println("Original String: "+ s );
//        System.out.println("Reverse String: "+ obj2.solution(s) );

//        Q3--
//        LargestOddNumberInString obj3=new LargestOddNumberInString();
//        System.out.println(s);
//        System.out.println(obj3.solution(s));

//        Q4-----------------------
//        int n= sc.nextInt();
//        String arr[]=new String[n];
//        for(int i=0;i<n;i++){
//            arr[i]= sc.next();
//        }
//        LongestCommonPrefix obj4=new LongestCommonPrefix();
//        System.out.println(Arrays.toString(arr));
//        System.out.println(obj4.solution(arr));

//        Q5-----------------
        IsomorphicStrings obj5=new IsomorphicStrings();
        System.out.println(obj5.solution(s,t));


    }
}