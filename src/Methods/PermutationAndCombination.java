package Methods;

import java.util.Scanner;

public class PermutationAndCombination {
    static int fact(int x) {
        int f = 1;
        for(int i=1;i<=x;i++){
            f *=i;
        }
        return f;
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n:");
        int n = sc.nextInt();
        System.out.println("Enter value of r:");
        int r = sc.nextInt();

        int ncr = fact(n)/(fact(r)*fact(n-r));
        int npr = fact(n)/fact(n-r);
        System.out.println(ncr+" "+npr);


    }
}
