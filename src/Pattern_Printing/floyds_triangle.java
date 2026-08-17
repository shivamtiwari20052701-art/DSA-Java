package Pattern_Printing;

import java.util.Scanner;

public class floyds_triangle {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();
        int a = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a++ +" ");

            }
            System.out.println();
        }
    }
}
