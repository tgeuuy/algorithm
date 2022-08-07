package acwing.AC_660;

import java.util.Formatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @Author tgeuuy
 * @Date 2021/12/27 10:11
 * @Version 1.0
 */
public class Main {

    public static void main(String[] args) {
        Map<Integer, Double> map = new HashMap<>();
        map.put(1, 4.00);
        map.put(2, 4.50);
        map.put(3, 5.00);
        map.put(4, 2.00);
        map.put(5, 1.50);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Double res = m * map.get(n);

        System.out.println("Total: R$ " + new Formatter().format("%.2f", res).toString());

    }
}
