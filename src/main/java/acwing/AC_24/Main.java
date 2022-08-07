package acwing.AC_24;

/**
 * @Author tgeuuy
 * @Date 2021/11/20 18:02
 * @Version 1.0
 */
public class Main {
    public static int[][] nums = new int[4][5];
    public static int count = 1;
    public static boolean[][] st = new boolean[100][100];

    public static void main(String[] args) {
        int res = movingCount(3, 10, 10);
        System.out.println("res=" + res);
    }

    public static int sum(int x, int y) {
        int a = get(x);
        int b = get(y);
        return a + b ;
    }

    private static int get(int num) {
        if (num == 0) return 0;
        else return num % 10 + get(num / 10);
    }

    public static int movingCount(int threshold, int rows, int cols) {
        if (rows == 0 && cols == 0) return 0;
        return dfs(threshold, rows, cols, 0, 0);
    }

    private static int dfs(int threshold, int rows, int cols, int x, int y) {
//        System.out.println(x + " " + y);
        if (sum(x, y)>threshold) return 0;
        st[x][y] = true;
        int[] dx = {1, 0, -1, 0}, dy = {0, 1, 0, -1};
        for (int i = 0; i < 4; i++) {
            int a = x + dx[i], b = y + dy[i];
            if (a >= 0 && a < rows && b >= 0 && b < cols && !st[a][b]&&sum(a,b)<=threshold) {
//                System.out.println("a=" + a + " " + "b=" + b);
                count++;
                dfs(threshold, rows, cols, a, b);
            }
        }
        return count;
    }
}
