package zuochengyun.class03;

public class Xiaohe {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 4, 2, 5}; //结果 16
        int res = smallSum(arr);
//        System.out.println("sssssssssssss");
        System.out.println(res);

    }

    public static int smallSum(int[] arr) {
        if (arr == null || arr.length < 2) {
            return 0;
        }
//        for (int num : arr) System.out.println(num);
        return process(arr, 0, arr.length - 1);
    }

    private static int process(int[] arr, int l, int r) {
        if (l == r) {
            return 0;
        }
        int mid = (l + r) >> 1;
        return process(arr, l, mid) + process(arr, mid + 1, r) + merge(arr, l, mid, r);
    }

    private static int merge(int[] arr, int l, int mid, int r) {
        int[] help = new int[r - l + 1];
        int i = 0;
        int p1 = l;
        int p2 = mid + 1;
        int res = 0;
        while (p1 <= mid && p2 <= r) {
            res += arr[p1] < arr[p2] ? (r - p2 + 1) * arr[p1] : 0;
            help[i++] = arr[p1] < arr[p2] ? arr[p1++] : arr[p2++];
        }

        while (p1 <= mid) {
            help[i++] = arr[p1++];
        }
        while (p2 <= r) {
            help[i++] = arr[p2++];
        }
        for (i = 0; i < help.length; i++) {
            arr[l + i] = help[i];
        }
        return res;

    }


}
