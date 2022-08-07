package acwing.AC_748;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @Author tgeuuy
 * @Date 2022/1/11 11:47
 * @Version 1.0
 */
public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String ch = sc.next();
        double[][] num = new double[12][12];
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                num[i][j] = sc.nextDouble();
            }
        }

        double sum = 0;

        double c = 0;
        for (int i = 1; i < 12; i++) {
            for (int j = 12 - i; j < 12; j++) {
                sum += num[i][j];
                c++;
            }
        }

        System.out.printf("%.1f", ch.equals("S") ? sum : sum / c);


    }
}
