package Arrays;

public class RotateArray {
    static void reverse(int[] arr, int i, int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }}
    static void main() {
        int[] arr ={41,5,2,6,7,8,9,3};
        int d = 57;
        int n = arr.length;
        d %= n;//when number of given rotation is more than element
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
        for(int ele : arr){
            System.out.print(ele+" ");
        }

    }
}
