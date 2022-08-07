package acwing.AC_791;

import java.util.Scanner;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: acwing.AC_791
 * @Author: tgeuuy
 * @CreateTime: 2022-06-26  16:33
 * @Description: TODO
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String res = add(a, b);
        System.out.println(res);

    }

    public static String add(String a, String b) {
        if (a.length() < b.length()) return add(b, a);
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1;
        int c = 0;
        while (j >= 0 || i >= 0) {
            int x = i >= 0 ? a.charAt(i) - '0' : 0;
            int y = j >= 0 ? b.charAt(j) - '0' : 0;
            int s = (x + y + c) % 10;
            c = (x + y + c) / 10;
            sb.append(s);
            j--;
            i--;
        }
        if (c == 1) sb.append(c);
        return sb.reverse().toString();
    }
}
