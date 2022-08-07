package acwing.AC_798;


import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

/**
 * @BelongsProject: Algorithm
 * @BelongsPackage: acwing.AC_798
 * @Author: tgeuuy
 * @CreateTime: 2022-06-28  22:51
 * @Description: TODO
 * @Version: 1.0
 */
public class Main {
    public static final int MAXSIZE = 10005;
    public static int[][] arr = new int[MAXSIZE][MAXSIZE];
    public static int[][] sub = new int[MAXSIZE][MAXSIZE];

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = sc.nextInt();
        int m = sc.nextInt();
        int q = sc.nextInt();


        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= m; j++) {
                insert(i, j, i, j, arr[i][j]);
            }
        }
        while (q-- > 0) {

            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int c = sc.nextInt();
            insert(x1, y1, x2, y2, c);
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                sub[i][j] = sub[i][j] + sub[i - 1][j] + sub[i][j - 1] - sub[i - 1][j - 1];
                bw.write(sub[i][j] + " ");
            }
            bw.write("\n");
        }
        bw.flush();
        sc.close();
        bw.close();
    }

    private static void insert(int x1, int y1, int x2, int y2, int c) {
        //只需要处理4个点   (将O(n)的时间复杂度变成O(1))
        sub[x1][y1] += c;//将(x1,y1)右下角的所有点+c
        sub[x2 + 1][y1] -= c;//将(x2+1,y1)右下角的所有点-c
        sub[x1][y2 + 1] -= c;//将(x1,y2+1)右下角的所有点-c
        sub[x2 + 1][y2 + 1] += c;//将(x2+1,y2+1)右下角的所有点+c
    }
}
