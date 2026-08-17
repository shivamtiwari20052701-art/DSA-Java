package Pattern_Printing;

import java.util.Scanner;

public class ReverseTriangle {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n= sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i+1; j++){
                System.out.print("  ");
            }
            for(int j=n;j>=i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
