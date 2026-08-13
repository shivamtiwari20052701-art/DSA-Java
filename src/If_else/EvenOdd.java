package If_else;

import java.util.Scanner;

public class EvenOdd {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int n = sc.nextInt();
        if(n%2==0){
            System.out.print("even");
        }else{
            System.out.println("odd");
        }
    }
}
