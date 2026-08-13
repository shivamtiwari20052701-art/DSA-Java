package Pattern_Printing;

import java.util.Scanner;

public class Alphabet_Square_4 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print((char)(i+96)+" ");
            }
            System.out.println();
        }
    }
}
