package If_else;

import java.util.Scanner;

public class TernaryBasics {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number");
        int n = scanner.nextInt();
//        if(n%2==0) System.out.println("Even");
//        else System.out.println("Odd");
      //condition ? sach : jhoot
        System.out.println((n%2==0 ? "Even" : "odd"));

    }
}
