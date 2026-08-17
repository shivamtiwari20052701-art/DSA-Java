package Pattern_Printing;

import java.util.Scanner;

public class Bridge {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n= sc.nextInt();
        for(int i=1;i<=2*n-1;i++){
            System.out.print("* ");
        }
        System.out.println();
        int nsp =1;
        for(int i=1; i<=n-1; i++){//lines
            for(int j=1; j<=n-i; j++){//Stars
                System.out.print("*"+" ");
            }
            for(int j=1; j<=nsp; j++){//spaces
                System.out.print(" "+" ");
            }
            for(int j=1; j<=n-i; j++){//stars
                System.out.print("*"+" ");
            }

            nsp += 2;
            System.out.println();
        }
    }
}
