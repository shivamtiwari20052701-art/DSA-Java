package Arrays;

public class TwoSum {
    static void main() {
        int[] arr = {89,58,5,65,7,45};
        int target = 12;
        int n = arr.length;
        boolean found = false;
        for (int i = 0; i < n ; i++) {
            for(int j=i+1; j<n; j++){
                if(arr[i]+arr[j]==target){
                    System.out.print("target is found");
                    found = true;
                    break;
                }
            }

        }
        if(!found){
            System.out.println("not found the target");
        }
    }
}
