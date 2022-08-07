package acwing.AC_770;

import java.io.*;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: acwing.AC_770
 * @Author: tgeuuy
 * @CreateTime: 2022-07-02  21:54
 * @Description: TODO
 * @Version: 1.0
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] str = br.readLine().split(" ");
        String a = br.readLine();
        String b = br.readLine();
        for (String s : str) {
            if (a.equals(s)) bw.write(b + " ");
            else bw.write(s + " ");

        }
        bw.flush();
        bw.close();
        br.close();
    }
}
