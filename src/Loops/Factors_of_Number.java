package Loops;

import java.util.Scanner;

public class Factors_of_Number {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = sc.nextInt();
        for (int i = 1; i <=Math.sqrt(n) ; i++) {
            if(n%i==0) {
                System.out.println(i);
                if (i != (n / i)) {
                    System.out.println(n / i);
                }
            }

        }
    }
}
