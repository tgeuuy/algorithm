package acwing.AC_862;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: acwing.AC_862
 * @Author: tgeuuy
 * @CreateTime: 2022-07-02  23:03
 * @Description: TODO
 * @Version: 1.0
 */
public class Main {


    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] strs = new String[n];
        for (int i = 0; i < n; i++) {
            strs[i] = br.readLine();
        }

        Arrays.sort(strs, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.parseInt(o2.split(" ")[0]) - Integer.parseInt(o1.split(" ")[0]);
            }
        });

        for (String s : strs) {
            bw.write(s + " \n");
        }
        bw.flush();
        br.close();
        bw.close();

    }
}
