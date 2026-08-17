package Pattern_Printing;

import java.util.Scanner;

public class TriangleFlippedVertically {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n= sc.nextInt();

        //method1: Consider this is a square
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n;j++){
//                if(i+j > n) System.out.print("* ");
//                else System.out.print("  ");
//            }
//            System.out.println();
//        }----------
        //Method 2:-> Used Two Loops inside a loop
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){//Spaces
                System.out.print("  ");
            }
            for (int j=1; j<=i; j++){//Stars
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
