package acwing.AC_25;

/**
 * @Author tgeuuy
 * @Date 2021/11/21 15:31
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        int res = maxProductAfterCutting(8);
        System.out.println("res=" + res);

    }

    public static int maxProductAfterCutting(int n) {
        int[] f = new int[n + 1];
        f[0] = f[1] = 1;
        for (int i = 2; i < f.length; i++) {
            for (int j = 2; j < i; j++) {
                f[i] = Math.max(f[i], Math.max(j * (i - j), f[i - j] * j));
            }
        }
        return f[n];
    }


}
