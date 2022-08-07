package acwing.AC_89;

import java.util.Scanner;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: acwing.AC_89
 * @Author: tgeuuy
 * @CreateTime: 2022-06-27  22:29
 * @Description: TODO
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        long a, b, p;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        p = sc.nextInt();

        long res = 1 % p;
        while (b != 0) {
            if ((b & 1) == 1) res = res * a % p;
            a = a * a % p;
            b >>= 1;
        }
        System.out.println(res);
    }
}
