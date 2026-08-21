import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

//        Q1-------------------------------
//        SearchXElement obj1=new SearchXElement();
//        System.out.println(Arrays.toString(arr));
//        System.out.println(obj1.solution(arr,-1));

//        Q2-------------------------------------
//        LowerBound obj2=new LowerBound();
//        System.out.println(Arrays.toString(arr));
//        System.out.println(obj2.solution(arr,4));


//        Q3--------------------------------
//        UpperBound obj3=new UpperBound();
//        System.out.println(Arrays.toString(arr));
//        System.out.println(obj3.solution(arr,9));

//         Q4-------------------------------
//        SearchInsertPosition obj4=new SearchInsertPosition();
//        System.out.println(Arrays.toString(arr));
//        System.out.println(obj4.solution(arr,2));

//        Q5------------------------------
        FirstAndLastOccurrence obj5=new FirstAndLastOccurrence();
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(obj5.solution(arr,8)));



    }
}
