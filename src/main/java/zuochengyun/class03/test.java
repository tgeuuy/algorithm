package zuochengyun.class03;

public class test {
    public static void main(String[] args) {

        int[] arr01 = new int[]{1, 1, 2, 5, 1, 6, 8, 2, 3, 1};
        quickSort01(arr01, 0, arr01.length - 1);
        for (int num : arr01) System.out.print(num + "  ");
        System.out.println();

        int[] arr02 = new int[]{1, 1, 2, 5, 1, 6, 8, 2, 3, 1};
        quickSort02(arr02, 0, arr02.length - 1);
        for (int num : arr02) System.out.print(num + "  ");
        System.out.println();


        int[] arr03 = new int[]{1, 1, 2, 5, 1, 6, 8, 2, 3, 1};
        mergeSort(arr03, 0, arr03.length - 1);
        for (int num : arr03) System.out.print(num + "  ");
        System.out.println();
    }

    private static void mergeSort(int[] arr, int l, int r) {
        if (l >= r ) return;
        int mid = l + r >> 1;

        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);

        int i = l;
        int j = mid + 1;
        int k = 0;
        int[] temp = new int[arr.length ];
        while (i <= mid && j <= r) {
            if (arr[i] >= arr[j]) {
                temp[k++] = arr[j++];
            } else {
                temp[k++] = arr[i++];
            }

        }

        while (i <= mid) temp[k++] = arr[i++];
        while (j <= r) temp[k++] = arr[j++];
        for (i = l, j = 0; i <= r; i++, j++) {
            arr[i] = temp[j];
        }
    }

    private static void quickSort01(int[] arr, int l, int r) {
        if (l >= r) return;
        int i = l - 1, j = r + 1;
        int x = arr[(l + r) >> 1];

        while (i < j) {
            do i++; while (arr[i] < x);
            do j--; while (arr[j] > x);
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        quickSort01(arr, l, j);
        quickSort01(arr, j + 1, r);
    }

    public static void quickSort02(int[] q, int l, int r) {
        if (l >= r) return;
        int x = q[(l + r + 1) >> 1], i = l - 1, j = r + 1;
        while (i < j) {
            do ++i; while (q[i] < x);
            do --j; while (q[j] > x);
            if (i < j) {
                q[i] = q[i] ^ q[j];
                q[j] = q[i] ^ q[j];
                q[i] = q[i] ^ q[j];
            }
        }
        quickSort02(q, l, i - 1);
        quickSort02(q, i, r);
    }
}
