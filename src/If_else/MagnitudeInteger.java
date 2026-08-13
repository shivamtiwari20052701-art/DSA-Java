package If_else;

import java.util.Scanner;

public class MagnitudeInteger {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the integer number:");
        int n = sc.nextInt();
        if(n<0 && n>-69){
            n *= -1;
            System.out.println("smaller than 69 :" + n);
        }else if(n>0 && n<69){
            System.out.println(" smaller than 69");
        }else{
            System.out.println("Not smaller than 69");
        }
    }
}
