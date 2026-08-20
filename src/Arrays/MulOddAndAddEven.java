package Arrays;

public class MulOddAndAddEven {
    static void main() {
        int[] arr = {89,7,58,25,65,45};
        for (int i = 0; i < arr.length; i++) {
            if(i%2==0){
                arr[i] += 10;
            }else{
                arr[i] *=2;
            }
            System.out.print(arr[i]+" ");
        }

    }
}
