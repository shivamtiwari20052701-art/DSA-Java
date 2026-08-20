package Arrays;

public class PassingArrayTOMethods {
    static void change(int[] x) {//this x is a reference variable
        x[3]=99;

    }
    static void main() {
       int[] x = {12,48,87,69,36};
        System.out.println(x[3]);
        change(x);
        System.out.println(x[3]);//will print 99


    }
}
