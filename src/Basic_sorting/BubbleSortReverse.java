package Basic_sorting;

public class BubbleSortReverse {
    public static void print(int[] arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    static void main() {
        int[] arr = {5,3,1,4,2};
        int n = arr.length;

        for(int i=0;i<n-1;i++) {
            int swap =0;
            for (int j = 0; j <n-1-i; j++) {//har baar ek kam
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap++;

                }
            }
            if(swap==0) break;
        }
        print(arr);
    }
}
