
package acwing.AC_653;

import java.util.Scanner;

/**
 * @Author tgeuuy
 * @Date 2022/1/9 15:23
 * @Version 1.0
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = {100, 50, 20, 10, 5, 2, 1};
        System.out.println(n);
        for (int v : arr) {
            if (n != 0) {
                int c = n / v;
                n = n - c * v;
                System.out.printf("%d nota(s) de R$ %d,00%n", c, v);
            } else {
                System.out.printf("%d nota(s) de R$ %d,00%n", 0, v);
            }

        }
    }
}
