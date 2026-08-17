package Pattern_Printing;

import java.util.Scanner;

public class Alphabet_hor_flipped_2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();
        for(int i=1; i<=n;i++){
            for(int j=1; j<=n+1-i ;j++){
                System.out.print((char)(i+64)+" ");
            }
            System.out.println();

        }
    }
}
