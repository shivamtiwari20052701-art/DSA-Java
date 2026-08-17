package Pattern_Printing;

import java.util.Scanner;

public class Diamond {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n= sc.nextInt();
        int nsp =n-1, nst = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=nsp; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=nst; j++){
                System.out.print("* ");
            }
            nsp -= 1;
            nst += 2;
            System.out.println();
        }
        nsp = 1;
        nst = 2*n-3;
        for(int i=1; i<=n-1; i++){//run n-1 times
            for(int j=1; j<=nsp; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=nst; j++){
                System.out.print("* ");
            }
            nsp++;
            nst -= 2;
            System.out.println();
        }

    }
}
