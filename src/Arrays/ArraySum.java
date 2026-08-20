package Arrays;

import java.util.Scanner;

public class ArraySum {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        System.out.print("Enter the elements:");
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int sum =0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        System.out.print(sum);
    }
}
