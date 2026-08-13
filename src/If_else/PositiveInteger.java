package If_else;

import java.util.Scanner;

public class PositiveInteger {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a positive integer");
        int n = sc.nextInt();
        if(n%5==0 && n%3==0){
            System.out.println("shivam");
        } else if (n%5==0) {
            System.out.println("veer");

        } else if (n%3==0) {
            System.out.println("kirtan");

        } else if (n%5 != 0 || n%3 != 0) {
            System.out.println("rishi bhaii");

        }else {
            System.out.println("invalid number");
        }
    }
}
