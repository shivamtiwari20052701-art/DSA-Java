package Arrays;

public class SecondMax {
    static void main() {
        int[] arr = {89,58,5,65,7,45};
        int max = 0;
        int Smax = 0;
        //calculate max
        for(int i=0; i< arr.length; i++){
            if(arr[i]>max){
                max = arr[i];

            }
        }
        //calculate smax
        for(int j=0; j<arr.length; j++){
            if(arr[j] > Smax && arr[j]!=max){
                Smax = arr[j];

            }
        }
        System.out.print("The second max element is: "+Smax);
    }
}
