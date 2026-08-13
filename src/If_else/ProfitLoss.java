package If_else;

import java.util.Scanner;

public class ProfitLoss {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the cost price");
        int cp = sc.nextInt();
        System.out.println("enter the selling price");
        int sp = sc.nextInt();
        if(sp>cp){
            System.out.println("profit is:" + (sp-cp));
            double profit_percent = ((double) (sp-cp)/cp)*100;
            System.out.println("proft % is :" + profit_percent );//profit_%=(profit/cost_price)/100
        } else if (sp<cp) {
            System.out.println("loss:" + (cp-sp));
            double loss_percent =((double) (cp-sp)/cp)*100;
            System.out.println("loss % is :" + loss_percent);//profit_%=(profit/cost_price)/100
        }
        else {
            System.out.println("no profit no loss");
        }
    }
}
