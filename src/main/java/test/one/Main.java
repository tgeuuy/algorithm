package test.one;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int res = getOne(str);
        System.out.println("res="+res);

    }

    public static int getOne(String str) {
        if (str.length() <= 2) return 0;
        int c = 0;
        for (int i = 2; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9') {
                int num = ch - '0';
                c += get(num);
            } else if (ch >= 'a' && ch <= 'f') {
                int num = ch - 'a' + 10;
                c += get(num);
            }
        }
        return c;

    }
    public static int get(int n) {
        if (n == 0) return 0;
        int res = 0;
        while (n != 0) {
            n -= n & -n; // 减去并记录
            res++;
        }
        return res;
    }
}
