package acwing.AC_95;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @Author: sunwisepace
 * @CreateTime: 2022-07-20  16:36
 * @Description: TODO
 * @Version: 1.0
 */
public class Main {
    public static int[][] arr = new int[5][5];
    public static int[][] copy = new int[5][5];
    public static int n;
    public static int[] dx = {0, 1, 0, -1, 0};
    public static int[] dy = {0, 0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.valueOf(br.readLine());
        while (n-- > 0) {
            for (int i = 0; i < 5; i++) {
                String str = br.readLine();
                for (int j = 0; j < str.length(); j++) {
                    arr[i][j] = str.charAt(j) - '0';
                }
            }
            br.read();
            System.out.println(dfs());
        }

    }
    public static int dfs() {
        int ans = 7;
        for (int i = 0; i < (1 << 5); i++) {  //枚举第一行32种情况
            int sum = 0;
            for (int j = 0; j < 5; j++) {    // 复制一份数据
                for (int k = 0; k < 5; k++) {
                    copy[j][k] = arr[j][k];
                }
            }

            for (int j = 0; j < 5; j++) {
                if ((i >> j & 1) == 1) {
                    sum++;
                    trun(0, j);
                }
            }

            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 5; k++) {
                    if (arr[j][k] == 1) {
                        sum++;
                        trun(j + 1, k);
                    }
                }
            }
            boolean dark = false;
            for (int j = 0; j < 5; j++) {
                if (arr[4][j] == 0) {
                    dark = true;
                    break;
                }
            }
            for (int j = 0; j < 5; j++) {    // 复制一份数据
                for (int k = 0; k < 5; k++) {
                    arr[j][k] = copy[j][k];
                }
            }

            if (!dark) ans = Math.min(sum, ans);
        }
        if (ans > 6) ans = -1;
        return ans;
    }

    private static void trun(int x, int y) {
        for (int i = 0; i < 5; i++) {
            int a = dx[i] + x;
            int b = dy[i] + y;
            if (a >= 0 && a < 5 && b >= 0 && b < 5) {
                arr[a][b] = 1 - arr[a][b];
            }
        }
    }


}

