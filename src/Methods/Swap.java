package Methods;

import java.util.Scanner;

public class Swap {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a = sc.nextInt();
        System.out.println("Enter the value of b:");
        int b = sc.nextInt();

        int temp = a;
        a = b;
        b = temp;
        System.out.println("a:"+a+" "+"b:"+b);


    }
}
