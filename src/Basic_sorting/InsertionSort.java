package Basic_sorting;

public class InsertionSort {
    static void main(String[] args) {
        int[] arr = {4,6,8,3,1,31,5,17,9};
        //Insertion Sort Algorithm

        for(int i=1; i< arr.length;i++){
            int j=i;
            while (j>0 && arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j]  =  arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
        for(int ele: arr){
            System.out.print(ele+" ");
        }
    }
}
