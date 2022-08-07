package bishi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RongYao_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        int t = sc.nextInt();

        while (t-- > 0) {
            String str = sc.next();
            if (str.length() > 8) {
                int i = 0;
                for (; i < str.length(); i = i + 8) {
                    if (i + 8 < str.length()) list.add(str.substring(i, i + 8));

                }
                System.out.println("str.length()=" + str.length());
                System.out.println("i=" + i);
                if (i - 8 < str.length()) {
                    StringBuilder sb = new StringBuilder(str.substring(i - 8));
                    for (int j = str.length(); j < (str.length() / 8 + 1) * 8; j++) {
                        sb.append('0');
                    }
                    list.add(sb.toString());
                }

            } else {
                StringBuilder sb = new StringBuilder(str);
                for (int j = 8; j > str.length(); j--) {
                    sb.append('0');
                }
                list.add(sb.toString());
            }
        }
        Collections.sort(list);
        String[] ss = new String[list.size()];
        for (int i = 0; i < ss.length; i++) {
            ss[i] = list.get(i);
        }
        for (String stra : ss) System.out.println(stra + " ");
    }
}
