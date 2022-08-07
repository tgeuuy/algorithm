package acwing.AC_65;

/**
 * @Author tgeuuy
 * @Date 2021/12/16 10:22
 * @Version 1.0
 */
public class Main {

    public static int c = 0;

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 0};
        int res = inversePairs(nums);
        System.out.println("res=" + res);

    }

    private static int inversePairs(int[] nums) {
        dfs(nums, 0, nums.length - 1);
        return c;
    }

    private static void dfs(int[] nums, int l, int r) {
        if (l >= r) return;
        int[] tmp = new int[nums.length];
        int mid = (l + r) / 2;
        dfs(nums, l, mid);
        dfs(nums, mid + 1, r);


        int k = 0, i = l, j = mid + 1;
        while (i <= mid && j <= r) {
            if (nums[i] <= nums[j]) {
                tmp[k++] = nums[i++];
            } else {
                tmp[k++] = nums[j++];
                c += mid - i + 1;
            }
        }


        while (i <= mid) tmp[k++] = nums[i++];
        while (j <= r) tmp[k++] = nums[j++];

        for (int p = l, q = 0; p <= r; p++, q++) nums[p] = tmp[q];


    }


}
