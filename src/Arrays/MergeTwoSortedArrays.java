package Arrays;

public class MergeTwoSortedArrays {
    static void main() {
            int[] a ={2,5,6,9};
            int[] b ={1,3,4,5,7,8,10,11};
            int[] c = new int[a.length+b.length];
        for(int ele : c){
            System.out.print(ele+" ");
        }
        System.out.println();
            merge(c,a,b);
            for(int ele : c){
                System.out.print(ele+" ");
            }
        System.out.println();
    }

    public static void merge(int[] c, int[] a, int[] b) {
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length) {
            if (a[i] < b[j]) {
                c[k] = a[i];
                i++;
            } else {
                c[k] = b[j];
                j++;
            }
            k++;
        }

            while(i<a.length)//agar b khali ho gya h to run hoga
                c[k++] = a[i++];
            while(j<b.length)//agar a khali ho gya a to run hoga
                c[k++] = b[j++];
        }
    }

