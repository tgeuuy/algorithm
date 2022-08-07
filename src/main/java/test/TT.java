package test;

import java.util.Scanner;

public class TT {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] st = new boolean[n + 1];
        int t = sc.nextInt();
        while (t-- > 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            for (int i = l; i <= r; i++) {
                if (st[i] == false) st[i] = true;
                else st[i] = false;
            }
            int c = 0;
            for (int i = 1; i <= n; i++) {
                if (st[i] == false) c++;
            }
            System.out.println(c);
        }
    }
}