package acwing.AC_793;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: acwing.AC_793
 * @Author: tgeuuy
 * @CreateTime: 2022-06-27  08:46
 * @Description: TODO
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int b = sc.nextInt();

        ArrayList<Integer> la = new ArrayList<>();


        for (int i = a.length() - 1; i >= 0; i--) la.add(a.charAt(i) - '0');

        List<Integer> res = multi(la, b);

        for (int i = res.size() - 1; i >= 0; i--) {
            System.out.print(res.get(i));

        }


    }

    public static List<Integer> multi(List<Integer> la, Integer b) {
        List<Integer> res = new ArrayList<>();
        int c = 0;
        for (int i = 0; i < la.size() || c != 0; i++) {
            if (i < la.size()) c += la.get(i) * b;
            res.add(c % 10);
            c /= 10;
        }
        int i = res.size() - 1;
        while (i > 0 && res.get(i) == 0) res.remove(i--);

        return res;
    }
}
