package Arrays;

public class SearchElementInArray {
    static void main() {
        int[] arr = {89,7,58,25,65,45};
        int target = 25;
        boolean found = false;
        for(int i = 0; i < arr.length ; i++) {
            if(arr[i]==target){
                found = true;
                break;
            }
            }
        if(found){
            System.out.println(" found");
        }else{
            System.out.println("not found");
        }
    }
}
