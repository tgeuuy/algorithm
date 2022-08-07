package acwing.AC_57;

import java.util.Scanner;

/**
 * @Author tgeuuy
 * @Date 2021/12/3 9:25
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = digitAtIndex(n);
        System.out.println("res=" + res);

    }


    public static int digitAtIndex(int n) {
        if (n == 0) return 0;

        StringBuilder sb = new StringBuilder();
        int c = 1;
        while (sb.length() <= n + 1) {
            sb.append(String.valueOf(c));
            c++;
        }
        char ch = sb.charAt(n - 1);
        return ch - '0';
    }
}
