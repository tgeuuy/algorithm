package acwing.AC_775;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: acwing.AC_775
 * @Author: tgeuuy
 * @CreateTime: 2022-06-29  20:22
 * @Description: TODO
 * @Version: 1.0
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char[] chs = str.toCharArray();
        swap(chs, 0, chs.length - 1);
        int i = 0, j = 0;
        while (i <= j && j < str.length()) {
            while (j < chs.length && chs[j] != ' ') j++;
            swap(chs, i, j - 1);
            i = j + 1;
            j = i;
        }
        System.out.println(new String(chs));

        br.close();

    }

    private static void swap(char[] str, int l, int r) {
        while (l < r) {
            char t = str[l];
            str[l] = str[r];
            str[r] = t;
            l++;
            r--;

        }
    }
}
