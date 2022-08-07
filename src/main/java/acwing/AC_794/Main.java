package acwing.AC_794;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: acwing.AC_794
 * @Author: tgeuuy
 * @CreateTime: 2022-06-27  10:39
 * @Description: TODO
 * @Version: 1.0
 */
public class Main {

    public static int r = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int b = sc.nextInt();

        List<Integer> res = dev(a, b);

        for (int i = 0; i < res.size(); i++) {
            System.out.print(res.get(i));
        }

        if (r != 0) System.out.print(r);
    }

    private static List<Integer> dev(String a, Integer b) {
        List<Integer> res = new ArrayList<>();
        List<Integer> la = new ArrayList<>();
        for (int i = a.length() - 1; i >= 0; i--) {
            la.add(a.charAt(i) - '0');
        }
        for (int i = la.size() - 1; i >= 0; i--) {
            r = r * 10 + la.get(i);
            res.add(r / b);
            r %= b;
        }
        int i = 0;
        while (i < res.size() && res.get(i) == 0) res.remove(i);
        return res;

    }
}
