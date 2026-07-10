import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

//        Sort1--
        SelectionSort obj1=new SelectionSort();
        System.out.println("Unsorted Array "+ Arrays.toString(arr));
        System.out.println("Sorted Array "+Arrays.toString(obj1.Sorting(arr,n)));


    }
}