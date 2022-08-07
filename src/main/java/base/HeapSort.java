package base;


public class HeapSort {
    public static void main(String[] args) {
        int[] arr = {3124, 23445, 36, 31, 234, 365, 4367, 45};
        heapSort(arr);
        for (int v : arr) System.out.print(v + " ");
        System.out.println();
    }

    private static void heapSort(int[] arr) {
        for (int i = (arr.length - 1) / 2; i >= 0; i--) {
            adjustHeap(arr, i, arr.length);
        }

        for (int i = arr.length - 1; i > 0; i--) {
            swap(arr, 0, i);
            adjustHeap(arr, 0, i);
        }


    }

    private static void adjustHeap(int[] arr, int parent, int length) {
        int tmp = arr[parent]; //当前节点
        int left = 2 * parent + 1; //左孩子
        while (left < length) {
            int right = left + 1;  //右孩子
            if (right < length && arr[left] < arr[right]) left++;
            if (tmp >= arr[left]) break;
            arr[parent] = arr[left];
            parent = left;
            left = 2 * left + 1;
        }
        arr[parent] = tmp;
    }
    private static void swap(int[] arr, int a, int b) {
        arr[a] = arr[a] ^ arr[b];
        arr[b] = arr[a] ^ arr[b];
        arr[a] = arr[a] ^ arr[b];
    }


}
