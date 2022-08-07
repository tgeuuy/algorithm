package acwing.AC_154;


import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @Author: sunwisepace
 * @CreateTime: 2022-07-09  23:32
 * @Description: TODO
 * @Version: 1.0
 */

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        Deque<Integer> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            if (!queue.isEmpty() && i - k + 1 > queue.peekLast()) queue.pollLast();
            while (!queue.isEmpty() && arr[queue.peekLast()] >= arr[i]) queue.pollFirst();
            queue.offerFirst(i);
            if (i >= k - 1) System.out.println(arr[queue.getLast()]);
        }

        sc.close();

    }
}
