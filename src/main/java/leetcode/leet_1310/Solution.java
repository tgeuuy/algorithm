package leetcode.leet_1310;

import java.util.Arrays;

public class Solution {


    public static void main(String[] args) {
        //arr = [1,3,4,8], queries = [[0,1],[1,2],[0,3],[3,3]]
        int[] arr = {1, 3, 4, 8};
        int[][] queries = {{0, 1}, {1, 2}, {0, 3}, {3, 3}};
        int[] res = xorQueries(arr, queries);
        for (int v : res) System.out.print(v + " ");
        System.out.println();

    }


    public static int[] xorQueries(int[] arr, int[][] queries) {
        int[] xor = new int[arr.length + 1];
        xor[0] = 0;
        for (int i = 1; i < xor.length; i++) {
            xor[i] = arr[i - 1] ^ xor[i - 1];
        }
//        System.out.println(Arrays.toString(xor));
        int[] res = new int[queries.length];
        int i = 0;
        for (int[] q : queries) {
            res[i] = xor[q[1]+1] ^ xor[q[0]];
            i++;
        }
        return res;


    }

}
