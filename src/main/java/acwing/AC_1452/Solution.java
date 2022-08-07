package acwing.AC_1452;

/**
 * @Author tgeuuy
 * @Date 2021/10/29 10:12
 * @Version 1.0
 */
public class Solution {
    public static void main(String[] args) {
        int[][] arr = {{2, 3, 4, 6, 7},
                {6, 8, 3, 3, 5},
                {12, 14, 9, 9, 1},
                {5, 8, 5, 9, 13},
                {9, 6, 3, 7, 1}};
        int[] res = getMinimumValue(arr);
        System.out.println(res[0]);
        System.out.println(res[1]);
    }


    public static int[] getMinimumValue(int[][] arr) {
        int n = arr.length;
        int lo = 0, hi = n - 1;

        while (lo < hi) {
            int mid = lo + (hi - lo >> 1);

            int min = Integer.MAX_VALUE;
            int minIndex = -1;
            for (int i = 0; i < n; i++) {
                int temp = arr[i][mid];
                if (min > temp) {
                    min = temp;
                    minIndex = i;
                }
            }
            if (min <= 0) {
                lo = mid + 1;
            } else if (arr[minIndex][mid - 1] > min && arr[minIndex][mid + 1] > min) {
                return new int[]{minIndex, mid};
            }

            if (arr[minIndex][mid - 1] < min) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }

        int min = Integer.MAX_VALUE;
        int minIndex = -1;

        for (int i = 0; i < n; i++) {
            int temp = arr[i][lo];
            if (min > temp) {
                min = temp;
                minIndex = i;
            }
        }
        return new int[]{minIndex, lo};
    }


}
