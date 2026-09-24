package Arrays;

public class MergeSortedArrayReverse {
    static void main() {
        int[] a = {2,5,6,9,20};
        int[] b = {1,3,4,5};
        int[] c = new int[a.length+b.length];
        for(int ele:c){
            System.out.print(ele+" ");
        }
        System.out.println();
        MergeReverse(a,b,c);
        for(int ele:c){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    private static void MergeReverse(int[] a, int[] b, int[] c) {
        int i = a.length-1;
        int j = b.length-1;
        int k = c.length-1;
        while (a[i] == 0 && b[j] == 0) {
            if (a[i] > b[j]) {
                c[k] = a[i];
                i--;

            } else {
                c[k] = b[j];
                j--;

            }
            k--;
        }
        while(i>=0){//b array khtam ho gya h.
            c[k--] = a[i--];
        }
        while(j>=0){//a array khtam ho gya h.
            c[k--] = b[j--];
        }
    }


}
