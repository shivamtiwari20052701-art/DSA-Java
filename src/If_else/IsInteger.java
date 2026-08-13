package If_else;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class IsInteger {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any real number");
        double n = sc.nextDouble();
        if(n==(int)n){
            System.out.println("is an integer");
        }
        else{
            System.out.println("NOT an integer");
        }
    }
}
