package leetcode.leet_1833;

import org.junit.Test;

import java.util.Arrays;

public class Solution {

    public final static int MAX = 1005;

    public int[] tmp = new int[MAX];

    @Test
    public void test() {
        System.out.println("res= " + maxIceCream(new int[]{1, 3, 2, 4, 1}, 7));
    }


    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);

        sort(costs, 0, costs.length - 1);
        int count = 0;
        int n = costs.length;
        for (int i = 0; i < n; i++) {
            int cost = costs[i];
            if (coins >= cost) {
                coins -= cost;
                count++;
            } else {
                break;
            }
        }
        return count;
    }

    private void sort(int[] costs, int l, int r) {
        if (l >= r) return;
        int mid = l + r >> 1;
        int q = costs[mid];
        int i = l - 1, j = r + 1;
        while (i < j) {
            do i++; while (costs[i] < q);
            do j--; while (costs[j] > q);
            if (i < j) {
                costs[i] = costs[i] ^ costs[j];
                costs[j] = costs[i] ^ costs[j];
                costs[i] = costs[i] ^ costs[j];
            }
        }
        sort(costs, l, j);
        sort(costs, j + 1, r);
    }

//    private void sort(int[] costs, int l, int r) {
//        if (l >= r) return;
//        int mid = (l + r) >> 1;
//        sort(costs, l, mid);
//        sort(costs, mid + 1, r);
//
//        int i = l, j = mid + 1, k = 0;
//        while (i <= mid && j <= r) {
//            if (costs[i] < costs[j]) {
//                tmp[k++] = costs[i++];
//            } else {
//                tmp[k++] = costs[j++];
//            }
//        }
//
//
//        while (i <= mid) tmp[k++] = costs[i++];
//        while (j <= r) tmp[k++] = costs[j++];
//
//
//        for (int p = l, q = 0; p <= r; p++, q++) {
//            costs[p] = tmp[q];
//        }
//    }


}
