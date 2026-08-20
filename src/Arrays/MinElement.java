package Arrays;

public class MinElement {
    static void main() {
        int[] arr = {45,2,98,36,78,25,47,963,87,26};
        int min = arr[0];
        for(int i=0;i< arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.print(min);
    }
}
