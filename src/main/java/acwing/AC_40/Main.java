package acwing.AC_40;

/**
 * @Author tgeuuy
 * @Date 2021/11/28 17:01
 * @Version 1.0
 */
public class Main {
    public static int m;
    public static int n;
    public static boolean[][] mark;
    public static int[] res;

    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        int c = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = c++;
                System.out.print(matrix[i][j] + " ");
            }
        }
        System.out.println();
        int[] res = printMatrix(matrix);
        for (int re : res) {
            System.out.print(re + " ");
        }
        System.out.println();


    }

    public static int[] printMatrix(int[][] matrix) {
        n = matrix.length;
        m = matrix[0].length;
        res = new int[m * n];
        boolean[][] mark = new boolean[n][m];
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        int x = 0, y = 0;
        int d = 0;
        for (int i = 0; i < m * n; i++) {
            res[i] = matrix[x][y];
            mark[x][y] = true;
            int a = x + dx[d], b = y + dy[d];
//            System.out.println(a + " " + b);
            if (a < 0 || a >= n || b < 0 || b >= m || mark[a][b]) {
                d = (d + 1) % 4;
                a = x + dx[d];
                b = y + dy[d];
            }
            x = a;
            y = b;
        }
        return res;
    }
}
