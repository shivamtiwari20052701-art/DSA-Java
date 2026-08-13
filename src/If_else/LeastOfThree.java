package If_else;

import java.util.Scanner;

public class LeastOfThree {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first no.:");
        int a = sc.nextInt();
        System.out.print("enter second no:");
        int b = sc.nextInt();
        System.out.print("enter third no:");
        int c = sc.nextInt();

        if(a<b){
            if(a<c){
                System.out.println(a);
            }else{
                System.out.println(c);
            }
        } else if (b<c) {
            if(b<a){
                System.out.println(b);
            }
            else {
                System.out.println(a);
            }

        } else if (c<a) {
            if(c<b){
                System.out.println(c);
            }else{
                System.out.println(b);
            }

        }else{
            System.out.println(a);
        }

    }
}
