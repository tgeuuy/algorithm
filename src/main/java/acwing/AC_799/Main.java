package acwing.AC_799;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: acwing.AC_799
 * @Author: tgeuuy
 * @CreateTime: 2022-07-03  22:17
 * @Description: TODO
 * @Version: 1.0
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Set<String> set = new HashSet<>();

        int n = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        int res = 0;

        for (int i = 0, j = 0; i < n; i++) {
            if (!set.contains(str[i])) set.add(str[i]);
            else {
                while (j < i && !str[j].equals(str[i])) {

                    set.remove(str[j]);
                    j++;

                }
                j++;
                set.add(str[i]);
            }
            res = Math.max(res, i - j + 1);
        }

        bw.write(res + "\n");
        bw.flush();
        bw.close();


    }
}
