package zuochengyun.class04;

public class test {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 5, 7, 8, 3, 5, 2};
        heapSort(arr);
        for(int n:arr) System.out.print(n+" ");
        System.out.println();
    }

    public static void heapSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            heapInsert(arr, i); //构造完全二叉树
        }
        int size = arr.length;
        swap(arr, 0, --size);
        while (size > 0) {
            heapify(arr, 0, size);// 最后一个数与根交换
            swap(arr, 0, --size);
        }

    }

    //判断该结点与父结点的大小，大结点一直往，建立大根堆
    public static void heapInsert(int[] arr, int index) {
        while (arr[index] > arr[(index - 1) / 2]) {
            swap(arr, index, (index - 1) / 2);
            index = (index - 1) / 2;
        }
    }

    //一个值变小往下沉的过程
    public static void heapify(int[] arr, int index, int size) {
        int left = index * 2 + 1;
        while (left < size) {
            int largest = left + 1 < size && arr[left + 1] > arr[left] ? left + 1 : left;
            largest = arr[largest] > arr[index] ? largest : index;
            if (largest == index) {
                break;
            }
            swap(arr, largest, index);
            index = largest;
            left = index * 2 + 1;

        }
    }

    //交换函数
    public static void swap(int[] arr, int i, int j) {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }
}
