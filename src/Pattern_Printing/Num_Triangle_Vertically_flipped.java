package Pattern_Printing;

import java.util.Scanner;

public class Num_Triangle_Vertically_flipped {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n= sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){//Spaces
                System.out.print("  ");
            }
            for (int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
