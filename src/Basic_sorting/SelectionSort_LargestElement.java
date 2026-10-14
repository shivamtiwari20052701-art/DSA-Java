package Basic_sorting;

public class SelectionSort_LargestElement {
    public static void print(int[] arr){
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    static void main() {
        int[] arr = {8,4,1,9,-3,6,5};
        int n = arr.length;
        int last = n-1;
        print(arr);
        while(last>0){
            int max = Integer.MIN_VALUE;
            int maxindex = 0;
            for(int j=last; j>=0 ; j-- ){
                if(arr[j]>max){
                    max = arr[j];
                    maxindex = j;

                }
            }
            int temp = arr[last];
            arr[last] = arr[maxindex];
            arr[maxindex] = temp;
            last--;



        }

        print(arr);
    }
}
