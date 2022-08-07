package niuke.jiandan;

import org.junit.Test;

import java.util.Arrays;

public class NC_19_DP {

    /**
     * max sum of the subarray
     * * @param arr int整型一维数组 the array
     * * @return int整型
     */


    @Test
    public void practice() {
        int[] arr = new int[]{1, -2, 3, 5, -2, 6, -1};
        int res = maxsumofSubarray(arr);
        System.out.println("res=" + res);
//        System.out.println(Integer.MIN_VALUE);
    }


//    public int maxsumofSubarray(int[] arr) {
//        int res = 0;
//        for (int i = arr.length-1; i >=0; i--) {
//            int sum = 0;
//            for (int j = 0; j < i; j++) {
//                sum += arr[j];
//            }
//            res = Math.max(sum, res);
//            System.out.println(res);
//        }
//        return res;
//
//
//    }

    public int maxsumofSubarray(int[] arr) {
        int res = Integer.MIN_VALUE;
        int sum = 0;

        for (int v : arr) {
            sum += v;
            res = Math.max(sum, res);
            sum = Math.max(sum, 0);
        }
        return res;
    }

//    public int maxsumofSubarray(int[] arr) {
//        int res = Integer.MIN_VALUE;
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i - 1] > 0) {
//                arr[i] += arr[i - 1];
//            }
//        }
//        Arrays.sort(arr); //排序
//        System.out.println("排序后取最大值为：" + arr[arr.length - 1]);
//        return arr[arr.length - 1];
//    }
}
