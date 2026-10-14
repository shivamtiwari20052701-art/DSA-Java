package Basic_sorting;


public class SelectionSort {
    public static void print(int[] arr){
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    static void main() {
        int[] arr = {8,4,1,9,-3,6,5};
        int n = arr.length;
        print(arr);
        for (int i = 0; i < n-1; i++) {
            int min = Integer.MAX_VALUE;
            int mindex = 0;
            for(int j = i; j<n; j++){
                if(arr[j]<min){
                    min = arr[j];
                    mindex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[mindex];
            arr[mindex] = temp;


        }
        print(arr);
    }
}
