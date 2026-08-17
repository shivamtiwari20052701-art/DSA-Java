package Pattern_Printing;

import java.util.Scanner;

public class Hollow_Rectangle {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int n = sc.nextInt();
        System.out.println("Enter number of Columns:");
        int m = sc.nextInt();
        for(int i=1; i<=n;i++){
            for(int j=1; j<=m;j++){
                if(i==1 || i==n ||j==1 ||j==m) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
