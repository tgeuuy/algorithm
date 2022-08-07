package acwing.AC_712;

import java.util.Scanner;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: acwing.AC_712
 * @Author: tgeuuy
 * @CreateTime: 2022-06-29  14:38
 * @Description: TODO
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        int res = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            float f = sc.nextFloat();
            if (f > 0) res++;
        }
        System.out.println(res);

    }
}
