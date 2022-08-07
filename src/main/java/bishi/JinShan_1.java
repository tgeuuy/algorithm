package bishi;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.*;

public class JinShan_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strs = str.split(" ");
//        for (String s : strs) System.out.println(s);
        for (int i = 0; i < strs.length; i++) {
            strs[i] = strs[i].toLowerCase();
        }

        int i = 0, j = 0;
        while (j < strs.length) {
            if (!strs[i].equals(strs[j])) {
                i++;
                strs[i] = strs[j];
            }
            j++;
        }
        StringBuilder sb = new StringBuilder();
        for (int p = 0; p <= i; p++) {
            if (p == 0) {
                sb.append(strs[0]).append(" ");
            } else {
                sb.append(strs[p]).append(" ");
            }

        }
        System.out.println(sb);
    }
}
