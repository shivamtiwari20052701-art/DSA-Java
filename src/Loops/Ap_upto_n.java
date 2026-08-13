package Loops;

import java.util.Scanner;

public class Ap_upto_n {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = sc.nextInt();
        int a =4 , d = 6;
        for (int i = 1; i <=n ; i++) {
            System.out.println(a+" ");
            a += d;

        }
    }
}
