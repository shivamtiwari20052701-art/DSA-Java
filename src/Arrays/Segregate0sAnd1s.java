package Arrays;

public class Segregate0sAnd1s {
    static void main() {
        int[] arr = {0,0,1,1,0,0,1,0,1};
        int n = arr.length;;
        //--------------------------------------Method 1 -----------------------------------------------------
//        int i = 0;
//        int j = n-1;
//        while (i < j){
//        if(arr[i]==0){
//            i++;
//        } else if (arr[j]==1) {
//            j--;
//
//        }else {
//
//                if (arr[i] != arr[j]) {
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                    i++;
//                    j--;
//                }
//            }
//        }
//        for(int ele:arr){
//            System.out.print(ele+" ");
//        }
        //-------------------------------------------Method 2-------------------------------------
        int NoOfZeros = 0;
        for(int ele:arr){
            if(ele==0){
                NoOfZeros++;
            }
        }
        for(int i=0; i<NoOfZeros; i++){
            arr[i] = 0;
        }
        for(int i=NoOfZeros; i<n; i++){
            arr[i] = 1;
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
