package acwing.AC_608;

import java.util.Scanner;

/**
 * @Author tgeuuy
 * @Date 2021/12/27 11:54
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        System.out.println("DIFERENCA = " + (A * B - C * D));
    }
}
