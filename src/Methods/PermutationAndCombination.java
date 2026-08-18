package Methods;

import java.util.Scanner;

public class PermutationAndCombination {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n:");
        int n = sc.nextInt();
        System.out.println("Enter value of r:");
        int r = sc.nextInt();
        int nFact = 1;
        for(int i=0;i<=n;i++){
            nFact *=i;
        }
        int rFact = 1;
        for(int i=0;i<=r;i++){
            rFact *=i;
        }
        int nrFact = 1;
        for(int i=0;i<=n-r;i++){
            nrFact *=i;
        }
        int ncr = nFact/(rFact*nrFact);
        System.out.println(ncr);


    }
}
