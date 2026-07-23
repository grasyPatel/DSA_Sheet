import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();

        int arr1[]=new int[n];

        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
//        int m=sc.nextInt();
//        int arr2[]=new int[m];
//        for(int i=0;i<m;i++){
//            arr2[i]=sc.nextInt();
//        }


//        Q1--
//        LargestElement obj1=new LargestElement();
//        System.out.println(obj1.largestElementInArray(arr));

//        Q2--
//        SecondLargest obj2=new SecondLargest();
//        System.out.println(obj2.secondLargestElement(arr));

//        Q3--
//        IsArraySorted obj3=new IsArraySorted();
//        System.out.println(obj3.isSorted(arr));

//        Q4--
//        RemoveDuplicatesFromSortedArray obj4 =new RemoveDuplicatesFromSortedArray();
//        System.out.println(Arrays.toString(arr));
//        System.out.println(obj4.remove(arr,n));
//        System.out.println(Arrays.toString(arr));

//        Q5--
//        LeftRotateByOne obj5=new LeftRotateByOne();
//        System.out.println(Arrays.toString(arr));
//        obj5.rotate(arr,n);
//        System.out.println(Arrays.toString(arr));


//        Q6--
//        MoveZerosToEnd obj6= new MoveZerosToEnd();
//        System.out.println(Arrays.toString(arr));
//        obj6.moveElement(arr, n);
//        System.out.println(Arrays.toString(arr));

//        Q7--
//        LinerSearch obj7 =new LinerSearch();
//        System.out.println(obj7.search(arr, n, 8));

//        Q8--
//        UnionTwoSortedArray obj8=new UnionTwoSortedArray();
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(arr2));
//        System.out.println(Arrays.toString(obj8.unionOfArrays(arr1,arr2)));

//        Q9--
//        FindMissingNumberRange0ton obj9=new FindMissingNumberRange0ton();
//        System.out.println(Arrays.toString(arr1));
//        System.out.println("Missing Number "+obj9.missingElement(arr1));

//        Q10--
//        MaximumConsecutiveOnes obj10=new MaximumConsecutiveOnes();
//        System.out.println(Arrays.toString(arr1));
//        System.out.println("ConsecutiveOnes: "+obj10.countOne(arr1));

//        Q11-
//        SingleNumber1 obj11=new SingleNumber1();
//        System.out.println(Arrays.toString(arr1));
//        System.out.println("Number appears ones:  "+obj11.findNumber(arr1));

//        Q12--
//        LongestSubArraySumk obj12=new LongestSubArraySumk();
//        System.out.println(Arrays.toString(arr1));
//        System.out.println("Size of Array: "+obj12.subArraySumWithK(arr1,15));

//        Q13--
//        LeftRotateByK obj13=new LeftRotateByK();
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(obj13.rotateByK(arr1,2)));

//        Q14--
//        TwoSum obj14=new TwoSum();
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(obj14.twoSum1(arr1,0)));


//        Q15--
//        Sort012 obj15=new Sort012();
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(obj15.sorting(arr1)));

//        Q16--
//        MajorityElement1 obj16=new MajorityElement1();
//        System.out.println(Arrays.toString(arr1));
//        System.out.println("Majority Element: "+ obj16.findElement(arr1));

//        Q17--
        KadansAlgo obj17=new KadansAlgo();
        System.out.println(obj17.solution(arr1,n));






    }
}