package If_else;

import java.util.Scanner;

public class TernaryInVariable {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number ");
        int n = sc.nextInt();

        int shivam = (n>0) ? 100:0;
        System.out.println(shivam);
    }
}
