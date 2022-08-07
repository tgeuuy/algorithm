package acwing.AC_790;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.Scanner;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: acwing.AC_790
 * @Author: tgeuuy
 * @CreateTime: 2022-06-25  23:44
 * @Description: TODO
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        String res = sqrt(n);
        System.out.println(res);

    }

    private static String sqrt(double n) {
        double l = -100;
        double r = 100;
        while (r - l > 0.000001) {
            double mid = (l + r) / 2.0;
            if (mid * mid * mid < n) r = mid;
            else l = mid;
        }
        return new DecimalFormat("#.000000").format(l);
    }
}
