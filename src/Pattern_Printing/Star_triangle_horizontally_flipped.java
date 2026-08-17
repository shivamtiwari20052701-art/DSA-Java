package Pattern_Printing;

import java.util.Scanner;

public class Star_triangle_horizontally_flipped {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();
        for(int i=1; i<=n;i++){
//            for(int j=n;j>=i;j--){
//                System.out.print("*"+" ");
//
//            }
//            System.out.println();
            //-------or----------Mostly use this, because this is standard template
            for(int j=1;j<=n+1-i;j++){//i+jmax=n+i-->jmax=n+1-i//this will be our condition approach
                System.out.print("*"+" ");

            }
            System.out.println();

        }
    }
}
