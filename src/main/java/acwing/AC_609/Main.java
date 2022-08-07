package acwing.AC_609;

import java.util.Scanner;

/**
 * @Author tgeuuy
 * @Date 2021/12/30 10:06
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numb = sc.nextInt();
        float time = sc.nextFloat();
        float sal = sc.nextFloat();
        System.out.println("NUMBER = " + numb);
        System.out.println("SALARY = U$" + String.format("%.2f", time * sal));
    }
}
