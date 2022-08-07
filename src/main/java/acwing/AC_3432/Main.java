package acwing.AC_3432;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author: sunwisepace
 * @CreateTime: 2022-07-21  13:58
 * @Description: TODO
 * @Version: 1.0
 */
public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        boolean flag = true;
        int a = Integer.valueOf(str[0]);
        int b = Integer.valueOf(str[1]);
        for (int i = 0; i <= 32; i++) {
            for (int j = 0; j <= 32; j++) {
                if (a >> j == b >> i) {
                    if (!flag) break;
                    System.out.println(a >> j);
                    flag = false;
                }
            }
            if (!flag) break;
        }

    }
}
