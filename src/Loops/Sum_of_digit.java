package Loops;

import java.util.Scanner;

public class Sum_of_digit {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number:");
        int n = sc.nextInt();
        int sum = 0;
        while(n != 0){
            sum += n%10;
            n /= 10;

        }
        System.out.println((sum>0) ? sum : -sum);

    }
}
