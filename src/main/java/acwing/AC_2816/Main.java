package acwing.AC_2816;

import com.sun.org.apache.regexp.internal.RE;

import java.io.*;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: acwing.AC_2816
 * @Author: tgeuuy
 * @CreateTime: 2022-07-03  23:06
 * @Description: TODO
 * @Version: 1.0
 */




public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        String[] a = br.readLine().split(" ");
        String[] b = br.readLine().split(" ");
        int i = 0 ;
        for (int j = 0; j < m; j++) {
            if (i < n && a[i].equals(b[j])) i++;

        }
        if (i == n ) bw.write("YES");
        else bw.write("NO");
        bw.flush();
        bw.close();
        br.close();
        return;
    }
}
