package acwing.AC_4079;

import java.util.Scanner;

/**
 * @Author tgeuuy
 * @Date 2021/11/29 11:30
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        for (Integer i = 1; i <= 1000; i++) {
            sb.append(i.toString());
        }
        while (c-- != 0) {
            int n = sc.nextInt();
            System.out.println(sb.charAt(n - 1));
        }
    }
}
