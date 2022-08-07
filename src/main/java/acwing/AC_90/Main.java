package acwing.AC_90;

import java.util.Scanner;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: acwing.AC_90
 * @Author: tgeuuy
 * @CreateTime: 2022-06-27  22:39
 * @Description: TODO
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();


        long res = 0;
        while (b != 0) {
            if ((b & 1) != 0) res = (res + a) % c;
            a = (a + a) % c;
            b >>= 1;
        }
        System.out.println(res);

    }
}
