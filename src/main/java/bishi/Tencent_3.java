package bishi;


import java.util.Arrays;
import java.util.Scanner;

public class Tencent_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine());
        String str = sc.nextLine();
        if (str.length() == 1) {
            System.out.println(1);
            return;
        }
        if (check(str, '0')) {
            System.out.println(1);
            return;
        }
        if (check(str, '1')) {
            System.out.println(str.length() + 1);
            return;
        }
        int res = Integer.MAX_VALUE;
        int[] l = new int[n + 1];
        int[] r = new int[n + 1];

        for (int i = 0; i < str.length(); i++) {
            l[i + 1] = getleft(str, 0, i);
        }

        for (int i = str.length(); i > 0; i--) {
            r[i - 1] = getright(str, i - 1, str.length() - 1);
        }

        System.out.println(Arrays.toString(l));
        System.out.println(Arrays.toString(r));
        for (int i = 0; i <= str.length(); i++) {
            System.out.println("l=" + l[i]);
            System.out.println("r=" + r[i]);
            System.out.println("******");
            res = Math.min(res, Math.abs(l[i] - r[i]));
        }


        System.out.println(res);

    }

    private static boolean check(String str, char ch) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ch) return false;
        }
        return true;
    }

    private static int getright(String str, int l, int r) {
        if (l > r) return 0;
        int res = 0;
        for (int i = l; i <= r; i++) {
            if (str.charAt(i) == '1') {
                res += i + 1;

            }
        }
        return res;
    }

    private static int getleft(String str, int l, int r) {
        if (l > r) return 0;
        int res = 0;

        for (int i = l; i <= r; i++) {
            if (str.charAt(i) == '0') res += i + 1;
        }
        return res;
    }
}
