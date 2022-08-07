package zuochengyun.class03;

public class Code01_MergeSort {


    private static void merge(int[] arr, int L, int M, int R) {
        int[] help = new int[R - L + 1];
        int i = 0;
        int P1 = L;
        int P2 = M + 1;
        while (P1 <= M && P2 <= R) {
            help[i++] = arr[P1] <= arr[P2] ? arr[P1++] : arr[P2++];
        }
        while (P1 <= M) {
            help[i++] = arr[P1++];
        }
        while (P2 <= R) {
            help[i++] = arr[P2++];
        }
        for (i = 0; i < help.length; i++) {
            arr[L + i] = help[i];
        }
    }

    public static void mergeSort1(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        process(arr, 0, arr.length - 1);

    }

    private static void process(int[] arr, int L, int R) {
        if (L == R) return;
        int mid = L + ((R - L) >> 1);
        process(arr, L, mid);
        process(arr, mid + 1, R);
        merge(arr, L, mid, R);
    }


    public static void mergeSort2(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        int N = arr.length;
        int mergeSize = 1;
        while (mergeSize < N) {
            int L = 0;
            while (L<N){
                int M = L + mergeSize - 1;
                if (M >= N) {
                    break;
                }
                int R = Math.min(M + mergeSize, N - 1);
                merge(arr, L, M, R);
                L = R + 1;
            }
            if (mergeSize > N / 2) {
                break;
            }
            mergeSize <<= 1;
            }
    }
}
