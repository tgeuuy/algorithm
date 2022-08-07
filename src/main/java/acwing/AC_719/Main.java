package acwing.AC_719;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int k = 0; k < n; k++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int s = 0;
            for (int i = Math.min(a, b) + 1; i < Math.max(a, b); i++) {
                s += Math.abs(i) % 2 == 0 ? 0 : i;
            }
            System.out.println(s);
        }

    }
}
