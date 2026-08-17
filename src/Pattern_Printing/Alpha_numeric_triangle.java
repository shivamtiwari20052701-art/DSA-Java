package Pattern_Printing;

import java.util.Scanner;

public class Alpha_numeric_triangle {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();
        for(int i=1; i<=n;i++){
            for(int j=1;j<=i;j++){
                if(i%2==0){
                    System.out.print((char)(j+64)+" ");
                }else{
                    System.out.print(j+" ");
                }

            }
            System.out.println();
        }
    }
}
