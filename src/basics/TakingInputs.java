package basics;

import java.util.Scanner;

public class TakingInputs {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n:" );
        int n = sc.nextInt();
        System.out.println("square of the number is :" + n*n);
    }
}
