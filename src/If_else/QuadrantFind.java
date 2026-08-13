package If_else;

import java.util.Scanner;

public class QuadrantFind {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value of X: ");
        int x = sc.nextInt();
        System.out.print("Enter Value of Y: ");
        int y = sc.nextInt();

        if(x>0 && y>0){
            System.out.print("First Quadrant");

        } else if (x<0 && y>0) {
            System.out.print("Second Quadrant");

        }
        else if (x<0 && y<0) {
            System.out.print("Third Quadrant");

        }
        else if (x>0 && y<0) {
            System.out.print("Fourth Quadrant");

        }
        else if (x==0 && y==0) {
            System.out.print("Origin");

        }
        else if (x==0) {
            System.out.print("y-axis");

        }
        else if (y==0) {
            System.out.print("x-axis");

        }
    }
}
