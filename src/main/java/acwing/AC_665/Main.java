package acwing.AC_665;

import java.util.Scanner;

/**
 * @Author tgeuuy
 * @Date 2022/1/10 15:51
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a % b == 0 || b % a == 0) System.out.println("Sao Multiplos");
        else System.out.println("Nao Sao Multiplos");
    }
}
