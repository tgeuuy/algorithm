package leetcode.leet_825;

import java.util.Arrays;

/**
 * @Author tgeuuy
 * @Date 2021/12/27 15:53
 * @Version 1.0
 */
public class Solution {
    public static void main(String[] args) {
        int[] ages = {20, 30, 100, 110, 120};
        int res = numFriendRequests(ages);
        System.out.println("res=" + res);
    }

    public static int numFriendRequests(int[] ages) {
        Arrays.sort(ages);
        int n = ages.length, ans = 0;
        for (int k = 0, i = 0, j = 0; k < n; k++) {
            while (i < k && !check(ages[i], ages[k])) i++;
            if (j < k) j = k;
            while (j < n && check(ages[j], ages[k])) j++;
            if (j > i) ans += j - i - 1;
        }
        return ans;

    }

    private static boolean check(int x, int y) {
        if (y <= 0.5 * x + 7) return false;
        if (y > x) return false;
        if (y > 100 && x < 100) return false;
        return true;


    }
}
