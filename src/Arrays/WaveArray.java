package Arrays;

public class WaveArray {
    static void main() {
        int[] arr = {1,2,3,4,5};
        for(int i=0;i< arr.length-1;i+=2){//kyoki mujhe hmesha agle wale ko dekhna h to ek step pichhe tak loop chlega
            if(arr[i+1]>arr[i]){
                int temp = arr[i+1];
                arr[i+1] = arr[i];
                arr[i] = temp;
            }

        }
        for(int ele: arr){
            System.out.print(ele+" ");
        }
    }
}
