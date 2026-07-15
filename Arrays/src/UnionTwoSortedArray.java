import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class UnionTwoSortedArray {
    public int[] unionOfArrays(int arr1[], int arr2[]){
        Set<Integer> set=new TreeSet<>();
        int i=0;
        int j=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                set.add(arr1[i]);
                i++;
            }
            else{
                set.add(arr2[j]);
                j++;
            }
        }
        while(i<arr1.length){
            set.add(arr1[i]);
            i++;

        }
        while (j<arr2.length){
            set.add(arr2[j]);
            j++;
        }
        int n=set.size();
        int arr[]=new int[n];
        int index=0;
        Iterator<Integer> it= set.iterator();
        while (it.hasNext()){
            int value= it.next();
            arr[index]=value;
            index++;

        }
        return arr;


    }
}
