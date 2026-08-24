package Arrays;

public class ForEach {
    static void main() {
        int[] arr = {5,7,8,65,45,23,21,36};
        //array ko print ya traverse karne k liye for each loop ka use karte hai.
        for(int ele : arr){//kewal arr ki copy rakhta h modify nhi karta h
            System.out.print(ele+" ");
        }
    }
}
