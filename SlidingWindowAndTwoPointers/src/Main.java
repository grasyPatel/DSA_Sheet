import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();

//        Q1-------------------
        LongestSubStringwithoutRepeatingCharacter obj1=new LongestSubStringwithoutRepeatingCharacter();
        System.out.println("String: "+s);
        System.out.println("Longest Length: "+obj1.solution(s));



    }
}