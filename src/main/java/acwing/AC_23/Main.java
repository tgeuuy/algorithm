package acwing.AC_23;

/**
 * @Author tgeuuy
 * @Date 2021/11/19 10:16
 * @Version 1.0
 */
public class Main {


    public static void main(String[] args) {
        char[][] matrix =
                {
                        {'A', 'B', 'C', 'E'},
                        {'S', 'F', 'C', 'S'},
                        {'A', 'D', 'E', 'E'}
                };
        String str = "dddd";
        boolean res = hasPath(matrix, str);
        System.out.println("res=" + res);

    }


    public static boolean hasPath(char[][] matrix, String str) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (dfs(matrix, str, 0, i, j)) {
                    return true;
                }

            }
        }
        return false;
    }

    private static boolean dfs(char[][] matrix, String str, int p, int x, int y) {
        if (matrix[x][y] != str.charAt(p)) return false;
        if (p == str.length() - 1) return true;
        System.out.println("x=" + x + " " + "y=" + y + " " + matrix[x][y]);
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};
        char t = matrix[x][y];
        matrix[x][y] = '*';
        for (int i = 0; i < 4; i++) {
            int a = x + dx[i], b = y + dy[i];
            if (a >= 0 && a < matrix.length && b >= 0 && b < matrix[a].length) {
                if (dfs(matrix, str, p + 1, a, b))
                    return true;
            }
        }
        matrix[x][y] = t;
        return false;
    }
}
