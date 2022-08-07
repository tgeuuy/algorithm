package leetcode.leet_1818;

import org.junit.Test;

import java.util.Arrays;

public class Soution {
    public final int MOD = 1000000007;

    @Test
    public void test() {
        int[] nums2 = new int[]{2, 3, 5};
        int[] nums1 = new int[]{1, 7, 5};

        System.out.println("res=" + minAbsoluteSumDiff(nums1, nums2));
    }

    private int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int[] rec = new int[n];
        System.arraycopy(nums1, 0, rec, 0, n);
        Arrays.sort(rec);
        int sum = 0, maxn = 0;
        for (int i = 0; i < n; i++) {
            int diff = Math.abs(nums1[i] - nums2[i]);
            sum = (sum + diff) % MOD;
            int j = binarySearch(rec, nums2[i]);
            if (j < n) {
                maxn = Math.max(maxn, diff - (rec[j] - nums2[i]));
            }
            if (j > 0) {
                maxn = Math.max(maxn, diff - (nums2[i] - rec[j - 1]));
            }
        }
        return (sum - maxn + MOD) % MOD;
    }

    private int binarySearch(int[] rec, int target) {
        int low = 0, high = rec.length - 1;
        if (rec[high] < target) {
            return high + 1;
        }
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (rec[mid] < target) {
                low = mid + 1;
            } else {
                high = mid;
            }

        }
        return low;
    }
}
