package niuke.rumen;

import com.sun.org.apache.xpath.internal.operations.Bool;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class NC38_spiralOrder {

    @Test
    public void practice() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9},{10,11,12}};
        ArrayList<Integer> res = spiralOrder(matrix);

        Iterator<Integer> it = res.iterator();
        while (it.hasNext()) {
            System.out.print(it.next()+" ");
        }
    }

    public ArrayList<Integer> spiralOrder(int[][] matrix) {

        ArrayList<Integer> res = new ArrayList<>();
        int n = matrix.length;
        int m = matrix[0].length;
        Boolean[][] mark = new Boolean[n][m];
//        Arrays.fill(mark,false);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mark[i][j] = false;
            }
        }

        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        for (int i = 0, x = 0, y = 0, d = 0; i < n * m; i++) {
//            System.out.println("x=" + x + " y=" + y);
            res.add(matrix[x][y]);
            mark[x][y] = true;
            int a = x + dx[d], b = y + dy[d];
//            System.out.println("a=" + a + " b=" + b + mark[a][b]);
            if (a < 0 || a >= n || b < 0 || b >= m || mark[a][b]) {
                d = (d + 1) % 4;
                a = x + dx[d];
                b = y + dy[d];
//                System.out.println("a=" + a + " b=" + b);
            }
            x = a;
            y = b;

        }
        return res;
    }
}
