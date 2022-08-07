package zati.dp.xianxing_dp;

import java.util.Arrays;

/**
 * 最长上升子序列
 *
 * @Author tgeuuy
 * @Date 2021/12/15 20:24
 * @Version 1.0
 */

public class LIS_Solution {
    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 6, 9, 10, 3, 15};
        int len = LIS(arr);
        System.out.println("res=" + len);
    }

    /**
     * 状态定义：f[i]表示以nums[i]为结尾的最长子序列长度
     * 状态转移：f[i] = f[j] + 1, 其中0 < j < i, 且nums[j] < nums[i]
     * 对于每一个i，找到i之前最长的子序列，并且把i添加到尾部，构成一个新的最长上升子序列
     * 时间复杂度： O(N^2)
     * @param arr
     * @return
     */
    private static int LIS(int[] arr) {

        int n = arr.length;
        int[] dp = new int[n];

        int res = 0;
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            res = Math.max(res, dp[i]);
        }
        return res;
    }

}
