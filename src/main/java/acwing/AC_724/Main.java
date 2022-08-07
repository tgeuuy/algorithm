package acwing.AC_724;

import java.util.Scanner;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: acwing.AC_724
 * @Author: tgeuuy
 * @CreateTime: 2022-06-29  14:45
 * @Description: TODO
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) System.out.println(i);
        }
    }
}
