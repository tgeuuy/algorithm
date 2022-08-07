package acwing.AC_62;

import java.util.Arrays;

/**
 * @Author tgeuuy
 * @Date 2021/12/16 11:09
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        int n = 10;
        int res = getUglyNumber(n);
        System.out.println("res=" + res);
    }

    private static int getUglyNumber(int n) {
        if (n <= 0) return 0;
        int[] res = new int[n];
        res[0] = 1;
        int next = 1, x2 = 0, y3 = 0, z5 = 0;
        while (next < n) {
            int min = Math.min(res[x2] * 2, Math.min(res[y3] * 3, res[z5] * 5));
            res[next++] = min;
            while (res[x2] * 2 <= min) x2++;
            while (res[y3] * 3 <= min) y3++;
            while (res[z5] * 5 <= min) z5++;
            System.out.println("x2=" + x2 + "  y3=" + y3 + "  z5=" + z5 + "  min=" + min);
        }
        System.out.println(Arrays.toString(res));
        return res[n - 1];
    }
}
