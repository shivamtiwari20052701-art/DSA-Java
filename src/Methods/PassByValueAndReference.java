package Methods;

public class PassByValueAndReference {
    static void change(int x){
         x= 10;
    }
    static void main() {
        int x =  8;
        System.out.println(x);
        change(x);//This is call By Value
        System.out.println(x);//this will print 8 there will no change.
    }
}
