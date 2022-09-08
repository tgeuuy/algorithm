package acwing.AC_1329;

public class Soultion {

    public static void main(String[] args) {
        int[][] mat = {{3, 3, 1, 1}, {2, 2, 1, 2}, {1, 1, 1, 2}};
        for (int[] ints : mat) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
        int[][] res = diagonalSort(mat);
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] diagonalSort(int[][] mat) {
        int n = mat.length, m = mat[0].length;
        for (int i = n - 1; i >= 0; i--) {
            for (int x = i, y = 0; x < n && y < m; x++, y++) {
                int ix = x, iy = y;
                for (int p = x, q = y; p < n && q < m; p++, q++) {
                    if (mat[p][q] < mat[ix][iy]) {
                        ix = p;
                        iy = q;
                    }
                }
                if (x == ix && y == iy) continue;
                mat[x][y] = mat[ix][iy] ^ mat[x][y];
                mat[ix][iy] = mat[ix][iy] ^ mat[x][y];
                mat[x][y] = mat[ix][iy] ^ mat[x][y];
            }
        }
        for (int i = 1; i < m; i++) {
            for (int x = 0, y = i; x < n && y < m; x++, y++) {
                int ix = x, iy = y;
                for (int p = x, q = y; p < n && q < m; p++, q++) {
                    if (mat[p][q] < mat[ix][iy]) {
                        ix = p;
                        iy = q;
                    }
                }
                if (x == ix && y == iy) continue;
                mat[x][y] = mat[ix][iy] ^ mat[x][y];
                mat[ix][iy] = mat[ix][iy] ^ mat[x][y];
                mat[x][y] = mat[ix][iy] ^ mat[x][y];
            }
        }
        return mat;

    }
}
