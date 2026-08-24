package Arrays;

public class ReverseArray {


    static void main() {
        int[] arr = {89,58,5,65,7,45,5};
        //two pointer approach


        int n = arr.length;
        //Method 2
//        for(int i=0; i<n/2; i++){//run the loop only half of the array
//            int temp = arr[i];
//            arr[i] = arr[n-1-i];
//            arr[n-1-i] = temp ;
//
//        }

        //method 1
        int i=0;
        int j=n-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for(int ele : arr){
            System.out.print(ele+" ");
    }
}
}
