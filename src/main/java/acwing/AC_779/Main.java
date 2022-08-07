package acwing.AC_779;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: acwing.AC_779
 * @Author: tgeuuy
 * @CreateTime: 2022-07-02  22:01
 * @Description: TODO
 * @Version: 1.0
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s;
        while (!(s = br.readLine()).equals("0")) {
            int n = Integer.valueOf(s);
            String ss = br.readLine();
            int max = 205;
            for (int i = 1; i < n; i++) {
                int res = 0;
                String tt = br.readLine();
                for (int j = 0; j < ss.length() && j < tt.length(); j++) {
                    if (ss.charAt(ss.length() - j - 1) == tt.charAt(tt.length() - j - 1)) res++;
                    else break;
                }
                max = Math.min(res, max);
            }
            bw.write(ss.substring(ss.length() - max) + " \n");
            bw.flush();
        }
    }
}
