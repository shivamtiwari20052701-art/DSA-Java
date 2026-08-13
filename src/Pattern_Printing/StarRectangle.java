package Pattern_Printing;

import java.util.Scanner;

public class StarRectangle {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int row = sc.nextInt();
        System.out.println("Enter number of Columns:");
        int col = sc.nextInt();
        for(int i=1; i<=row;i++){// kitni lines hongi
            for(int j=1; j<=col;j++){//har line me kitna print hoga
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
