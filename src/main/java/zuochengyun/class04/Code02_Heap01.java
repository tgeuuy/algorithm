package zuochengyun.class04;

public class Code02_Heap01 {

    public static class MyMaxHeap {
        private int[] heap;
        private final int limit;
        public int heapSize;

        public MyMaxHeap(int limit) {
            heap = new int[limit];
            this.limit = limit;
            heapSize = 0;
        }

        public boolean isEmpty() {
            return heapSize == 0;
        }

        public boolean isFull() {
            return heapSize == limit;
        }

        public void push(int value) {
            if (heapSize == limit) {
                throw new RuntimeException("heap is full");
            }
            heap[heapSize] = value;
            heapInsert(heap, heapSize++);
        }

        public int pop() {
            int ans = heap[0];
            swap(heap, 0, --heapSize);
            heapify(heap, 0, heapSize);
            return ans;
        }

        private void swap(int[] heap, int i, int j) {
            heap[i] = heap[i] ^ heap[j];
            heap[j] = heap[i] ^ heap[j];
            heap[i] = heap[i] ^ heap[j];
        }
        //大根堆，堆排序每次取完根数据，将最后一个补到根节点，然后调整二叉树变为大根堆。
        //下沉操作
        private void heapify(int[] arr, int index, int heapSize) {
//            根节点的左孩子
            int left = index * 2 + 1;
            while (left < heapSize) {
//                右孩子小于堆的最大容量 并且选取左右孩子中最大的值的索引作为largest的值
                int largest = left + 1 < heapSize && arr[left + 1] > arr[left] ? left + 1 : left;
//                将左右孩子中的最大的值与自己比较选取最大值
                largest = arr[largest] > arr[index] ? largest : index;
//                如果自己就是最大就break掉
                if (largest == index) {
                    break;
                }
                //然后交换自己和largest索引的值换
                swap(arr, largest, index);
                //重复这个交换
                left = index * 2 + 1;
            }

        }

        private void heapInsert(int[] arr, int index) {
            while (arr[index] > arr[(index - 1) / 2]) {
                swap(arr, index, (index - 1) / 2);
                index = (index - 1) / 2;
            }
        }

    }

}
