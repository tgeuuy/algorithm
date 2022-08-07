package acwing.AC_772;

import java.util.Scanner;

/**
 * @Author tgeuuy
 * @Date 2021/12/27 11:29
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] arr = new int[26];
        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i) - 'a']++;
        }
        boolean flag = false;
        for (int i = 0; i < str.length(); i++) {
            if (arr[str.charAt(i) - 'a'] == 1) {
                System.out.println((char) ('a' +(str.charAt(i) - 'a') ));
                flag = true;
                break;
            }
        }
        if (!flag) System.out.println("no");
    }
}
