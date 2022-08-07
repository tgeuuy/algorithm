package acwing.AC_604;

import java.util.Scanner;

/**
 * @Author tgeuuy
 * @Date 2021/12/30 9:44
 * @Version 1.0
 */
public class Main {

    public static final float PI = 3.14159f;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float R = sc.nextFloat();
        System.out.println("A=" + Double.parseDouble(String.format("%.4f", R * R * PI)));
    }

}
