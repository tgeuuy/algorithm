package acwing.AC_745;

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
        double[][] num = new double[12][12];
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                num[i][j] = sc.nextDouble();
            }
        }

        double sum = 0;
        int c = 0;
        for (int i = 0; i < 11; i++) {
            for (int j = i + 1; j < 12; j++) {
                sum += num[i][j];
                c++;
                //   System.out.println(i+" "+j);
            }
        }
        // System.out.println(c);
        System.out.printf("%.1f", ch.equals("S") ? sum : sum / c);


    }
}
