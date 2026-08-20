package Arrays;

import java.util.Scanner;

public class InputOutputArray {
    static void main() {
        Scanner sc = new Scanner(System.in);
        //output
//        int[] arr = {45,78,69,32,12,-78,96};//length-7
//        int n =arr.length;//index-0 to n-1
//        for(int i=0;i< n; i++){
//            System.out.println(arr[i]);
//        }

        int[] shivam = new int[3];
        //default values
//        for(int i=0; i< shivam.length; i++){
//            System.out.print(shivam[i]+" ");
//        }

        //Input
        for(int i=0; i< shivam.length; i++){
            shivam[i] = sc.nextInt();
        }
        //print
        for(int i=0; i< shivam.length; i++){
            System.out.print(shivam[i]+" ");
        }


    }
}
