package niuke.jiandan;

import org.junit.Test;

public class NC_22 {


    @Test
    public void practice() {
        int[] a = new int[]{-532452, -444, 1, 2, 4, 6, 3645, 8764, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] b = new int[]{-5452, -44, 1, 3, 4, 345, 5864, 545345};
        merge(a, 8, b, 8);
        for (int v : a) System.out.print(v + " ");
        System.out.println();


    }

    public void merge(int A[], int m, int B[], int n) {
        int[] res = new int[m + n];
        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            if (A[i] < B[j]) res[k++] = A[i++];
            else res[k++] = B[j++];
        }
        while (i < m) res[k++] = A[i++];
        while (j < n) res[k++] = B[j++];

        for (int p = 0; p < m + n; p++) A[p] = res[p];

    }
}
