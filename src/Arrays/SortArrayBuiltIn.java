package Arrays;
import java.util.*;
public class SortArrayBuiltIn {
    static void main() {
        //sort - ascending order
        int[] arr = {89,7,58,25,65,45};
        print(arr);
        Arrays.sort(arr);
        print(arr);//sorted
    }

    static void print(int[] arr) {
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");

        }
        System.out.println();

    }
}
