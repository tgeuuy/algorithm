package test;

import structurel.ListNode;

import java.util.*;

public class Demo3 {

    static List<List<Integer>> res = new ArrayList<>();
    static Deque<Integer> path = new LinkedList<>();

    public static void main(String[] args) {
//        int[] arr = {1, 4, 3, 2, 5, 6, 4, 3, 4, 5, 2, 4, 5, 6, 7};
        int[] arr = {1, 2, 3, 4, 7};
        List<List<Integer>> res = ziXuLie(arr, 7);
        for (List list : res) {
            System.out.println(list.toString());
        }

    }

    private static List<List<Integer>> ziXuLie(int[] arr, int tar) {
        if (arr == null || arr.length == 0) return null;
//        Arrays.sort(arr);
        dfs(arr, tar, 0);
        return res;

    }

    private static void dfs(int[] arr, int tar, int p) {
        if (tar == 0) {
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = p; i < arr.length; i++) {
//            if (i > 0 && arr[i] == arr[i - 1]) continue;
            if (tar - arr[i] >= 0) {
                path.addLast(arr[i]);
                dfs(arr, tar - arr[i], i + 1);
                path.removeLast();
            }
        }
    }
}
