package Loops;

import java.util.Scanner;

public class Count_digit {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number:");
        int n = sc.nextInt();
        if(n==0) n=1;
        int count = 0;
        while(n != 0){
            n /= 10;
            count +=1;
        }
        System.out.println(count);

    }
}
