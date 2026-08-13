package Loops;

import java.util.Scanner;

public class Gp {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the series n:");
        int n = sc.nextInt();
        int a = 1,r=2;
        for (int i = 1; i <=n ; i++) {
            System.out.println(a+" ");
            a *= r;

        }

    }
}
