package bishi;

import java.util.Arrays;
import java.util.Scanner;

public class BianLiFen_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int width = sc.nextInt();
        int k = 0;
        int[] w = new int[10005];
        int[] h = new int[10005];
        while (sc.nextLine() != null) {
            String str = sc.nextLine();
            String[] strs = str.split(" ");
            w[k] = Integer.valueOf(strs[0]);
            h[k] = Integer.valueOf(strs[1]);
            k++;
        }


        Arrays.sort(w);
        int res = 0;
        for (int i = 0; i < w.length; i++) {
            int t = 0;
            int he = 0;
            if (t >= width) {
                t = 0;
                res += he;
                he = 0;
            }
            t += w[i];
            he = Math.max(he, h[i]);

        }

        System.out.println(res);
    }
}
