package acwing.AC_792;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: acwing.AC_792
 * @Author: tgeuuy
 * @CreateTime: 2022-06-26  22:09
 * @Description: TODO
 * @Version: 1.0
 */
public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        if (cmp(a, b)) sub(a, b);
        else {
            System.out.print('-');
            sub(b, a);
        }

    }

    private static boolean cmp(String a, String b) {
        if (a.length() != b.length()) {
            return a.length() > b.length();
        }

        for (int i = 0; i < a.length(); i--) {
            if (a.charAt(i) != b.charAt(i)) {
                return a.charAt(i) > b.charAt(i);
            }
        }
        return true;
    }

    public static void sub(String a, String b) {
        ArrayList<Integer> sa = new ArrayList<>();
        ArrayList<Integer> sb = new ArrayList<>();
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = a.length() - 1; i >= 0; i--) sa.add(a.charAt(i) - '0');
        for (int i = b.length() - 1; i >= 0; i--) sb.add(b.charAt(i) - '0');
        int c = 0;
        for (int i = 0; i < sa.size(); i++) {
            c = sa.get(i) - c;
            if (i < sb.size()) c -= sb.get(i);
            res.add((c + 10) % 10);
            if (c < 0) c = 1;
            else c = 0;
        }
        int i = res.size() - 1;
        while (res.get(i) == 0 && i > 0) i--;
        for (; i >= 0; i--) {

            System.out.print(res.get(i));


        }


    }
}
