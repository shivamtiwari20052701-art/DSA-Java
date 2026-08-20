package Arrays;

public class MaxElement {
    static void main() {
        int[] arr = {45,2,98,36,78,25,47,963,87,26};
        int max = arr[0];
        //int max = Integer.MIN_VALUE
        for(int i=0;i< arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.print(max);
    }
}
