package If_else;

import java.util.Scanner;

public class FourDigitNumber {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter numbers:");
        int n = sc.nextInt();
        if(n>999 && n<9999){
            System.out.println("the number is Four digit number");
        }else{
            System.out.println("not a four digit number ");
        }
    }
}
