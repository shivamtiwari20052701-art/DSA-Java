package Basic_sorting;



public class BubbleSort {
    public static void print(int[] arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    static void main() {
        int[] arr = {3,-2,6,7,2,8,7,2};
        int n = arr.length;
        print(arr);
//        for(int i=0;i<n-1;i++) {
//            for (int j = 0; j <n-1-i; j++) {//har baar ek kam
//                if (arr[j] > arr[j + 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//
//                }
//            }
//        }
        //--------------------------optimized bubble sort
        for(int i=0;i<n-1;i++) {
            int swap =0;
            for (int j = 0; j <n-1-i; j++) {//har baar ek kam
                if (arr[j] > arr[j + 1]) {
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
