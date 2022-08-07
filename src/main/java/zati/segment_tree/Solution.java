package zati.segment_tree;

import java.util.Arrays;

public class Solution {

//    static int[] tree;


    private static void build_tree(int[] arr, int[] tree, int node, int start, int end) {
        System.out.println("start = " + start);
        System.out.println("end = " + end);
        if (start == end) {
            tree[node] = arr[start];
        } else {
            int mid = start + end >> 1;
            int left_node = 2 * node + 1;
            int right_node = 2 * node + 2;
            build_tree(arr, tree, left_node, start, mid);
            build_tree(arr, tree, right_node, mid + 1, end);
            tree[node] = tree[left_node] + tree[right_node];
        }

    }


    private static void update_tree(int[] arr, int[] tree, int node, int start, int end, int idx, int val) {
        if (start == end) {
            arr[idx] = val;
            tree[node] = val;
            return;
        }
        int left_node = 2 * node + 1;
        int right_node = 2 * node + 2;
        int mid = start + end >> 1;
        if (idx >= start && idx <= mid) {
            update_tree(arr, tree, left_node, start, mid, idx, val);
            ;
        } else {
            update_tree(arr, tree, right_node, mid + 1, end, idx, val);
        }

        tree[node] = tree[left_node] + tree[right_node];
    }

    private static int quary_sum(int[] arr, int[] tree, int node, int start, int end, int L, int R) {
        System.out.println("start = " + start + "   end = " + end);
//        System.out.println();
        if (R < start || L > end) {
            return 0;
        } else if (start == end) {
            return tree[node];
        } else if (L <= start && R >= end) {
            return tree[node];
        } else {
            int mid = start + end >> 1;
            int left_node = 2 * node + 1;
            int right_node = 2 * node + 2;
            int left = quary_sum(arr, tree, left_node, start, mid, L, R);
            int right = quary_sum(arr, tree, right_node, mid + 1, end, L, R);
            return left + right;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11};
        int n = arr.length;
        int[] tree = new int[4 * n];
        Arrays.fill(tree, Integer.MIN_VALUE);
        build_tree(arr, tree, 0, 0, n - 1);
        for (int i = 0; i < tree.length; i++) {
            System.out.print(tree[i] + " ");
        }
        update_tree(arr, tree, 0, 0, n - 1, 4, 6);
        System.out.println();

        for (int i = 0; i < tree.length; i++) {
            System.out.print(tree[i] + " ");
        }

        int res = quary_sum(arr, tree, 0, 0, n - 1, 1, 5);
        System.out.println("res = " + res);
    }


}
