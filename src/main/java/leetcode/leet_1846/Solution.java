package leetcode.leet_1846;

import org.junit.Test;


public class Solution {

    @Test
    public void test() {
        System.out.println("res=" + maximumElementAfterDecrementingAndRearranging(new int[]{2, 2, 1, 2, 1}));
    }

    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        int n = arr.length;
        System.out.println(n);
        sort(arr, 0, n - 1);
//        Arrays.sort(arr);
        for(int v:arr) System.out.print(v+" ");
        arr[0] = 1;
        for (int i = 1; i < n; i++) {
            arr[i] = Math.min(arr[i], arr[i - 1] + 1);
        }
        return arr[n - 1];
    }

    private void sort(int[] arr, int l, int r) {
        if (l >= r) return;
        int i = l - 1, j = r + 1;
        int q = arr[(r + l) >> 1];

        while (i < j) {
            do i ++; while (arr[i] < q);
            do j --; while (arr[j] > q);
            if (i < j) {
                arr[i] = arr[i] ^ arr[j];
                arr[j] = arr[i] ^ arr[j];
                arr[i] = arr[i] ^ arr[j];
            }
        }
        sort(arr, l, j);
        sort(arr, j + 1, r);

    }

    void quick_sort(int q[], int l, int r)
    {
        if (l >= r) return;

        int i = l - 1, j = r + 1, x = q[l + r >> 1];
        while (i < j)
        {
            do i ++ ; while (q[i] < x);
            do j -- ; while (q[j] > x);
            if (i < j) {
                q[i] = q[i] ^ q[j];
                q[j] = q[i] ^ q[j];
                q[i] = q[i] ^ q[j];
            }
        }

        quick_sort(q, l, j);
        quick_sort(q, j + 1, r);
    }

}
