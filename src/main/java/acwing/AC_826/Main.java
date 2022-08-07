package acwing.AC_826;

import java.io.*;

/**
 * @Author: sunwisepace
 * @CreateTime: 2022-07-06  19:41
 * @Description: TODO
 * @Version: 1.0
 */
import java.util.*;

public class Main{
    public static int N = 100000;
    public static int[] e = new int[N];
    public static int[] ne = new int[N];
    public static int head = -1;
    public static int idx = 0;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        while (n-- > 0) {
            String str = scan.next();
            if (str.equals("H")) {
                int x = scan.nextInt();
                insertHead(x);
            } else if (str.equals("I")) {
                int k = scan.nextInt();
                int x = scan.nextInt();
                insert(k - 1, x);
            } else if (str.equals("D")) {
                int k = scan.nextInt();
                if (k == 0)
                    head = ne[head];
                else
                    delete(k - 1);
            }
        }
        int i = head;
        while (i != -1) {
            System.out.print(e[i] + " ");
            i = ne[i];
        }
    }

    public static void insert(int k, int x) {
        e[idx] = x;
        ne[idx] = ne[k];
        ne[k] = idx;
        idx++;
    }

    public static void insertHead(int x) {
        e[idx] = x;
        ne[idx] = head;
        head = idx;
        idx++;
    }

    public static void delete(int k) {
        ne[k] = ne[ne[k]];
    }
}


