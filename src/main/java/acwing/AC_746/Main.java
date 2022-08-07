package acwing.AC_746;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @Author tgeuuy
 * @Date 2021/11/11 10:59
 * @Version 1.0
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String ch = sc.next();
        Float[][] num = new Float[12][12];
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                num[i][j] = sc.nextFloat();
            }
        }

        float sum = 0;
        float c = 0;
        for (int i = 1; i < 12; i++) {
            for (int j = 0; j < i; j++) {
                sum += num[i][j];
                c++;
            }
        }

        System.out.printf("%.1f", ch.equals("S") ? sum : sum / c);


    }
}
