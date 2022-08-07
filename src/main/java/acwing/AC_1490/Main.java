package acwing.AC_1490;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author tgeuuy
 * @Date 2021/12/24 11:30
 * @Version 1.0
 */
public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] l = new int[n + 2];
        int[] r = new int[n + 2];
        int[] nums = new int[n + 2];
        for (int i = 1; i <= n; i++) nums[i] = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (nums[i] > nums[i - 1]) l[i] = l[i - 1] + 1;
            else l[i] = 1;
        }
        for (int i = n; i >= 1; i--) {
            if (nums[i] < nums[i + 1]) r[i] = r[i + 1] + 1;
            else r[i] = 1;
        }
        System.out.println(Arrays.toString(l));
        System.out.println(Arrays.toString(r));
        int res = 0;
        for (int i = 1; i < n - 1; i++) {

            int left = l[i];
            int right = r[i];
            if (nums[i - 1] < nums[i + 1]) res = Math.max(res, left + right);
            else res = Math.max(Math.max(left, right), res);
        }
        System.out.println(res);
    }

}
