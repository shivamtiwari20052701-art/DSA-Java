package Arrays;

import java.util.Scanner;

public class PrintNegative {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array Size:");
        int n = sc.nextInt();
        System.out.print("Enter array elements:");
        int[] arr = new int[n];
        for(int i=0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        //print negative values
        for(int i=0;i<arr.length;i++){
            if (arr[i]<0) System.out.print(arr[i]+" ");
        }
    }
}
