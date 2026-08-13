package Loops;

import java.util.Scanner;

public class Composite_Number {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = sc.nextInt();
        boolean flag = true;//true means prime

        for (int i = 2; i <=Math.sqrt(n) ; i++) {
            if(n%i==0){
                flag = false;
                break;
            }
        }
        if(n==1) System.out.println("Neither Prime nor Composite");
        else if(flag == false) System.out.println("Composite Number");
        else System.out.println("Prime Number");

        }

}
