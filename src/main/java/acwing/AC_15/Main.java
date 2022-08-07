package acwing.AC_15;

/**
 * @Author tgeuuy
 * @Date 2021/11/15 9:24
 * @Version 1.0
 */
public class Main {


    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 8, 9},
                {2, 4, 9, 12},
                {4, 7, 10, 13},
                {6, 8, 11, 15}
        };
        int target = 7;
        boolean res = searchArray(arr, target);
        System.out.println("res=" + res);

    }

    public static boolean searchArray(int[][] array, int target) {
        if (array == null || array[0] == null) return false;
        int i = 0;
        int j = array[0].length - 1;
        while (i < array.length && j >= 0) {
            if (array[i][j] == target) return true;
            if (array[i][j] > target) j--;
            else i++;
        }
        return false;
    }

}
