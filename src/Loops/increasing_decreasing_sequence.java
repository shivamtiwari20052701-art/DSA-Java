package Loops;

import java.util.Scanner;

public class increasing_decreasing_sequence {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n = sc.nextInt();
        for (int i = 1; i <=10 ; i++) {
            System.out.println(i);
            System.out.println(n);
            n -= 1;

        }

    }
}
