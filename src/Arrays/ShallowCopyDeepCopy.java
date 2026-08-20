package Arrays;
import java.util.*;
public class ShallowCopyDeepCopy {
    static void main() {
        int a = 4;// 4 bytes leta hai ye
        int[] arr = {10,20,30,40,50};//16 byte ||contigous memory allocation kahte hai ise
//        int[] x = arr; // x is shallow copy of arr
//        x[0] = 99;//here x and arr both are same

        int[] y = Arrays.copyOf(arr,arr.length);//this is deep copy
        //deepCopy:-never changes the data of original array but shallow copy usually changes the data of original array.
        y[0] = 100;
        System.out.println(y[0]);
        System.out.println(arr[0]);
    }
}
