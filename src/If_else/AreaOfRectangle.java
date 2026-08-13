package If_else;

import java.util.Scanner;

public class AreaOfRectangle {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length:");
        int l =sc.nextInt();
        System.out.println("enter breadth:");
        int b = sc.nextInt();
        System.out.println("Area Of Rectangle is:" + l*b);
    }
}
