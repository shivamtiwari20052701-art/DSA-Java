package Arrays;

import java.util.ArrayList;

public class ArrayListInJavaBasics {
    static void main() {
        ArrayList<Integer> arr = new ArrayList<>();
        //to add elements
        arr.add(5);
        arr.add(6);
        arr.add(45);
        arr.add(18);
        arr.add(7);
        //System.out.print(arr.get(2));//arr[2]=45
        //To update
        arr.set(1,9);//arr[1]=9
        //System.out.print(arr.get(1));
        System.out.println(arr);//complete array list

        //complete size and array ko print karna ho to
        int n = arr.size();//Same as arr.length
        for(int i=0;i<n;i++){
            System.out.print(arr.get(i)+" ");

        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
