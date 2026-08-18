package Methods;

public class MaxOfTwo {
    static int max(int a , int b, int c) {//parameters
        if(a>=b && a>=c) return a;// this will return value of max()
        else if (b>=a && b>=c) return b;
        else return c;

    }
    static void main() {
        System.out.println(max(3,6,7));

    }
}
