package acwing.AC_617;

import java.util.Scanner;

/**
 * @Author tgeuuy
 * @Date 2022/1/10 14:44
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        System.out.printf("%.3f minutos", a * 60.0 / 30.0);

    }
}
