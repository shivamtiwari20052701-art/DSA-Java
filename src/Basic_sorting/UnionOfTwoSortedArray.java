package Basic_sorting;

import java.util.ArrayList;

public class UnionOfTwoSortedArray {
    static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5,};
        int[] b = {1, 2, 3, 6, 7};
        int i = 0, j = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        while (i < a.length && j < b.length) {
            if (a[i] == b[j]) {
                if(ans.isEmpty() ||ans.get(ans.size() - 1) != a[i]) {
                    ans.add(a[i]);
                }
                i++;
                j++;

            } else if (a[i] < b[j]) {
                if (ans.isEmpty() ||ans.get(ans.size() - 1) != a[i]) {
                    ans.add(a[i]);
                    i++;
                }
            } else {
                if (ans.isEmpty() ||ans.get(ans.size() - 1) != b[j]) {
                    ans.add(b[j]);
                    j++;
                }


            }
        }


    while (i < a.length) {
        if (ans.isEmpty() ||ans.get(ans.size() - 1) != a[i]) {
            ans.add(a[i]);
            i++;
        }

    }
    while (j < b.length) {
        if (ans.isEmpty() ||ans.get(ans.size() - 1) != b[j]) {
            ans.add(b[j]);
            j++;
        }

    }

            System.out.println(ans);


    }
}
