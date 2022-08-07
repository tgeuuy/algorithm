package zati.dp.xianxing_dp;

import java.util.Arrays;

/**
 * @Author tgeuuy
 * @Date 2021/12/15 21:46
 * @Version 1.0
 */
public class LCS_Solution {
    public static void main(String[] args) {
        String str1 = "acbd";
        String str2 = "abedc";
        int res = LCS(str1, str2);
        System.out.println("res=" + res);

    }

    /**
     * @param str1 匹配串
     * @param str2 模式串
     * @return
     */
    private static int LCS(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        int[][] f = new int[len2 + 10][len2 + 10];

        for (int i = 0; i < len1; i++) {
            for (int j = 0; j < len2; j++) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    f[i + 1][j + 1] = f[i][j] + 1;
                } else {
                    f[i + 1][j + 1] = Math.max(f[i][j + 1], f[i + 1][j]);
                }
            }
        }
        return f[len1][len2];
    }
}
