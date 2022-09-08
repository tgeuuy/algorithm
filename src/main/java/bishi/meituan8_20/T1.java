package bishi.meituan8_20;

import java.util.Scanner;

public class T1 {

    public static void main(String[] args) {
        StringBuilder res = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String a = sc.next();
        String b = sc.next();
        for (int i = 0; i < t; i++) {
            res.append(a.charAt(i)).append(b.charAt(i));
        }
        System.out.println(res.toString());
    }
}
