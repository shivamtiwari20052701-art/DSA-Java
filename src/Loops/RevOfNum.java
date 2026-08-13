package Loops;

import java.util.Scanner;

public class RevOfNum {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number:");
        int n = sc.nextInt();
        int rev = 0;
        while(n != 0){
            rev *= 10;
            rev += n%10;
            n /= 10;
        }
        System.out.print(rev);
    }
}
