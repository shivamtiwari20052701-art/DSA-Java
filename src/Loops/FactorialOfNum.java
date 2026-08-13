package Loops;

import java.util.Scanner;

public class FactorialOfNum {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number:");
        int n = sc.nextInt();
        int fact = 1;
        while(n !=0){
            fact *= n;
            n -=1;
        }
        System.out.println(fact);
    }
}
