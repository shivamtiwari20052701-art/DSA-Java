package Loops;

import java.util.Scanner;

public class SumAndReverse {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number:");
        int n = sc.nextInt();
        int total_sum =0;
        total_sum += n;
        int rev = 0;
        int sum = 0;
        while(n != 0){
            rev *=10;
            rev += n%10;
            sum += n%10;
            n /= 10;
        }
        System.out.println("Reverse of the number is "+rev);
        total_sum +=rev;
        System.out.println("total sum of the both of the number is:"+total_sum);




    }
}
