package bishi.shenfen;

import java.util.Scanner;

public class Ti_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            int bitCount = get(n);
            int res = 0;
            for (int i = 1; i <= bitCount; i++) {
                if (Math.pow(2, i) - 1 <= n) {
                    res += Math.pow(2, i - 1) * i;
                } else {
                    res += (n - Math.pow(2, i - 1) + 1) * i;
                }

            }
            System.out.println(res);
        }


    }

    public static int get(int n) {
        if (n <= 1) return 1;
        int res = 0;
        while (n != 0) {
            n >>= 1;
            res++;
        }
        return res;

    }
}
