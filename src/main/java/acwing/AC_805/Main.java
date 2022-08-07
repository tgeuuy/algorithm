package acwing.AC_805;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: acwing.AC_805
 * @Author: tgeuuy
 * @CreateTime: 2022-06-29  20:12
 * @Description: TODO
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int a = Integer.valueOf(str[0]);
        int b = Integer.valueOf(str[1]);
        System.out.println(max(a, b));

        br.close();
    }

    private static int max(int a, int b) {
        return a > b ? a : b;
    }
}
