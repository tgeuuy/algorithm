package zuochengyun.class04;

public class test1 {


    public static void main(String[] args) {
        int[] arr = {3, 5, 3, 0, 8, 6, 1, 5, 8, 6, 2, 4, 9, 4, 7, 0, 1, 8, 9, 7, 3, 1, 2, 5, 9, 7, 4, 0, 2, 6};
        System.out.println("arr.length=" + arr.length);
        sort(arr);
        for (int j : arr) {
            System.out.print(j+ " ");
        }
        System.out.println();
    }

    private static void sort(int[] arr) {
        if (arr == null || arr.length < 2) return;
        for (int i = arr.length/2 - 1; i >= 0; i--) {
//            System.out.println("ddd     " + i);
            heapify(arr, i, arr.length);
        }

      /*  int heapSize = arr.length;
        swap(arr, 0, --heapSize);
        while (heapSize > 0) {
            heapify(arr, 0, heapSize);
            swap(arr, 0, --heapSize);
        }*/
//        for (int n : arr) {
//            System.out.print(n + " ");
//        }
        for (int j = arr.length - 1; j > 0; j--) {
            swap(arr, 0, j);
            heapify(arr, 0, j);

        }
    }


    private static void heapify(int[] arr, int index, int heapsize) {
        int left = index * 2 + 1;
        while (left < heapsize) {
            int largest = left + 1 < heapsize && arr[left + 1] > arr[left] ? left + 1 : left;
            largest = arr[largest] > arr[index] ? largest : index;
            if (index == largest) {
                break;
            }
            swap(arr, index, largest);
            index = largest;
            left = index * 2 + 1;
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp;
        tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;

    }
}

