package Loops;

import java.util.Scanner;

public class PrintTable {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        for (int i = 1; i <=10 ; i++) {
            System.out.println(n*i);


        }
    }
}
