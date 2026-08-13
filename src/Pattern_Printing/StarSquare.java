package Pattern_Printing;

import java.util.Scanner;

public class StarSquare {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int n = sc.nextInt();
        for(int i=1; i<=n;i++){
            for(int j=1; j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
