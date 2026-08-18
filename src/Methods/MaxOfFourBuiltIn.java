package Methods;

import java.util.Scanner;

public class MaxOfFourBuiltIn {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number:");
        int a = sc.nextInt();
        System.out.println("Enter Second Number:");
        int b = sc.nextInt();
        System.out.println("Enter Third Number:");
        int c = sc.nextInt();
        System.out.println("Enter Fourth Number:");
        int d = sc.nextInt();
        System.out.println(Math.max(Math.max(a,b),Math.max(c,d)));
    }
}
