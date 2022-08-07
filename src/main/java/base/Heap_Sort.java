package base;

/**
 * @Author: sunwisepace
 * @CreateTime: 2022-07-28  23:23
 * @Description: TODO
 * @Version: 1.0
 */
public class Heap_Sort {


    public static void main(String[] args) {
        int[] arr = {1, 2, 432, 534, 6, 13123, 62, 45, 56, 436, 34, 64, 12, 344325, 33, 6};
        heapSort(arr);
        for (int v : arr) System.out.print(v + " ");
        System.out.println();
    }

    public static void heapSort(int[] arr) {
        if (arr.length == 0) return;
        int len = arr.length;
        for (int i = (len - 1) >> 1; i >= 0; i--) heapIfy(arr, i, arr.length);

        for (int i = len - 1; i > 0; i--) {
            swap(arr, 0, i);
            heapIfy(arr, 0, i);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }

    private static void heapIfy(int[] arr, int index, int length) {
        int tmp = arr[index];
        int left = index * 2 + 1;
        while (left < length) {
            int right = left + 1;
            if (right < length && arr[right] > arr[left]) left++;
            if (tmp >= arr[left]) break;
            arr[index] = arr[left];
            index = left;
            left = left * 2 + 1;
        }
        arr[index] = tmp;
    }
}
