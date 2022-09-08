package bishi.shenceshuju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class T3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String str = br.readLine();
            if (str == null || str.length() == 0) break;
            long res = 0;
            if (str.charAt(0) == '.' || str.charAt(str.length() - 1) == '.') {
                System.out.println(-1);
                continue;
            }

            String[] split = str.split("\\.");
            if (split.length != 7) {
                System.out.println(-1);
                continue;
            }
            boolean flag = true;
            for (int i = 6; i >= 0; i--) {
                for (int j = 0; j < split[i].length(); j++) {
                    if (split[i].charAt(j) < '0' || split[i].charAt(j) > '9') {
                        flag = false;
                    }
                }
                if (Integer.parseInt(split[i]) > 255) {
                    flag = false;
                }
                if (!flag) {
                    System.out.println(-1);
                    break;
                } else {
                    if ("".equals(split[i])) res = res * 256;
                    else res = res * 256 + Integer.parseInt(split[i]);
                }
            }
            if(!flag) continue;
            System.out.println(res);
        }
    }
}
