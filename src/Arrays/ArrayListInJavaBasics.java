package Arrays;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

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
        System.out.println();
        //5 9 45 18 7
        arr.add(37);//5,9,45,18,7,37
        //but if we want to any element between the array list
        arr.add(1,69);//add element 69 in 1st index
        System.out.println(arr);

        //Remove element from the array list
        arr.remove(arr.size()-1);//removes index 1 element form the array//includes the new number added in the array
        System.out.println(arr);

        //Reverse the array list

        int i=0, j=arr.size()-1;
        while(i<j){
            int tem = arr.get(i);
            arr.set(i,arr.get(j));
            arr.set(j,tem);
            i++;
            j--;
        }
        //Collections.reverse(arr);
        System.out.println(arr);


        //character array list
        ArrayList<Character> arr2 = new ArrayList<>();

        //double array list
        ArrayList<Double> arr3 = new ArrayList<>();

        //String array list
        ArrayList<String> arr4 = new ArrayList<>();
    }
}
