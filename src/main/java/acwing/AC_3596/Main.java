package acwing.AC_3596;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String a = null, b = null;
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {

            a = sc.next();
            b = sc.next();
            int i = a.length() - 1, j = b.length() - 1, c = 0;
            StringBuilder sb = new StringBuilder();
            while (i >= 0 || j >= 0) {
                int x = i >= 0 ? a.charAt(i) - '0' : 0;
                int y = j >= 0 ? b.charAt(j) - '0' : 0;
                sb.append((x + y + c) % 10);
                c = (x + y + c) / 10;
                i--;
                j--;
            }
            if (c == 1) sb.append(1);
            System.out.println(sb.reverse());

        }

    }
}
