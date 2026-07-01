import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Solution sol=new Solution();
        sol.pattern1(n);
        sol.pattern2(n);
        sol.pattern3(n);
        sol.pattern4(n);
        sol.pattern5(n);
        sol.pattern6(n);


    }
}