package Loops;

import java.util.Scanner;

public class A_raise_To_b {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a:");
        int a = sc.nextInt();
        System.out.println("enter b:");
        int b = sc.nextInt();
        int pow = 1;
        for(int i =1;i<=b;i++){
            pow *=a;
        }
        System.out.println(a+" raised to the power "+b+" is "+pow);

    }
}
