package acwing.AC_1636;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: acwing.AC_1636
 * @Author: tgeuuy
 * @CreateTime: 2022-06-28  23:06
 * @Description: TODO
 * @Version: 1.0
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> set = new TreeSet<>();
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (a > 0) set.add(a);
        }
        int res = 0;
        while (set.contains(res)) res++;
        System.out.println(res);

    }
}
